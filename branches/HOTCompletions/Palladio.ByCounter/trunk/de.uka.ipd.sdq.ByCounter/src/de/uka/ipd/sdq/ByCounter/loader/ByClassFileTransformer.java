package de.uka.ipd.sdq.ByCounter.loader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import de.uka.ipd.sdq.ByCounter.execution.BytecodeCounter;
import de.uka.ipd.sdq.ByCounter.instrumentation.InstrumentationParameters;
import de.uka.ipd.sdq.ByCounter.utils.Barrier;
import de.uka.ipd.sdq.ByCounter.utils.MethodDescriptor;

// TODO: make sure that methods that when a method is specified in the gui, but
// no method is instrumented (not found) an ERROR is logged!
/**
 * A ClassFileTransformer to be used on class loading to replace original 
 * classes with their instrumented versions.
 * 
 * This class can be used as a javaagent when packaged as the jar "ByLoader.jar" 
 * using the following commandline options:
 * "-javaagent:${project_loc}/lib/ByLoader.jar" (or what the correct path is) 
 *
 * @author Martin Krogmann
 * @author Michael Kuperberg
 * @since 0.9
 * @version 0.9
 */
public class ByClassFileTransformer implements ClassFileTransformer {
	
	private boolean instrumentFromFileSystem = false;
	private InstrumentationParameters instrumentationParameters;

	/**
	 * A logger instance (log4j)
	 */
	private static Logger log;

	/**
	 * This is called by the class loader before the main method.
	 * Adds this class as a transformer.
	 * @param options
	 * @param ins
	 */
	public static void premain(String options, Instrumentation ins) {
		ByClassFileTransformer t = new ByClassFileTransformer();
		Barrier barrier = new Barrier();	// used to synchronize with gui
		// create the gui that selects the methods to instrument
		t.createGui(barrier);
		// now that all options are pinned, add the transformer and continue
		ins.addTransformer(t);
	}
	
	// A list of the classes that were found and instrumented
	// used to error check
	private ArrayList<String> instrumentedClasses;
	
	public ByClassFileTransformer() {
		this.instrumentationParameters = null;
		instrumentedClasses = new ArrayList<String>();
		
		// add error checking at application shutdown
		Runtime.getRuntime().addShutdownHook(new Thread() {
		    public void run() {
		    	if(instrumentationParameters == null) {
		    		return;
		    	}
				// make sure that all specified classes have been instrumented
				log.debug("The following classes were instrumented: ");
				for(String s : instrumentedClasses) {
					log.debug(s.replace("/", "."));
				}
				for(MethodDescriptor m : instrumentationParameters.getMethodsToInstrument()) {
					if(!instrumentedClasses.contains(
							m.getCanonicalClassName())) {
						log.error("The class '" + m.getCanonicalClassName() + "'"
								+ " is not used or unknown and has not been instrumented!");
					}
				}
		    }
		});

		// setup log4j
		PropertyConfigurator.configure("log4j.properties");
		log = Logger.getLogger(this.getClass().getCanonicalName());
	}
	
	/**
	 * Add the given class to the list of classes that have been instrumented.
	 * @param className Name of the class.
	 */
	private void addToInstrumentedClasses(String className) {
		instrumentedClasses.add(className.replace("/", "."));
	}

	/**
	 * Create the gui to select the methods to instrument.
	 * @param bcft
	 * @param barrier
	 */
	private synchronized void createGui(final Barrier barrier) {
		final ByLoaderGUI g = new ByLoaderGUI(barrier);
        // Schedule a job for the event-dispatching thread:
        // creating and showing the GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                g.createAndShowGUI();
            }
        });
        
        // block and wait for the gui to return the methodlist
        try {
			barrier.block();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// get the list of methods to instrument from the gui
		InstrumentationParameters p = g.getInstrumentationParameters();
		if(p == null) {
			instrumentFromFileSystem = true;
		}
		this.setInstrumentationParameters(p);

        // The gui is obsolete now; dispose it.
       	g.dispose();
	}
	
	/**
	 * Gets the parameters on what kind instrumentation is to be done.
	 * @return An instance of {@link InstrumentationParameters}.
	 */
	private InstrumentationParameters getInstrumentationParameters() {
		return instrumentationParameters;
	}


	/**
	 * Do not instrument here but use preinstrumented files from filesystem.
	 * @param className Classname to decide on a match.
	 * @return instrumented byte[] or null for no transformation.
	 */
	private byte[] instrumentFromFilesystem(String className) {
		// Look in the directory with the instrumented classes for a matching class 
		File classFile = new File("bin_instrumented" + File.separatorChar + className + ".class");
		// if it is there, load that one instead.
		if(classFile.exists()) {
			addToInstrumentedClasses(className);
			FileInputStream fileInputStream = null;
			try {
				try {
					// read the bytes from the file
					fileInputStream = new FileInputStream(classFile);
					byte[] data = new byte[(int) classFile.length()];
					fileInputStream.read(data);
					// return the byte[] from the file as the transformed class
					return data;
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} finally {
					// don't forget to close the file
					if(fileInputStream != null) {
						fileInputStream.close();
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
        // null is the valid return value for "no transformation"
		return null;
	}

	/**
	 * Instrument the given class as specified in the parameters and 
	 * return the result.
	 * @param className Name of the class given as byte[]. Used to determine,
	 * if instrumentation has to be done.
	 * @param classFileBuffer The (uninstrumented) class file as byte[].
	 * @param params InstrumentationParameters specifying what and how
	 * to instrument.
	 * @return The transformed (instrumented) class file as byte[].
	 */
	private byte[] instrumentWithByCounter(String className, byte[] classFileBuffer, InstrumentationParameters params) {
		// instrument the method
		BytecodeCounter counter = null;
		
		// check whether we need to instrument this class
		if(isClassToInstrument(className, params)) {

			addToInstrumentedClasses(className);
			System.err.println("Using instrumentationparameters: " + params.toString());
			long startTime = System.nanoTime();
			System.err.println("START OF INSTRUMENTATION: " + startTime);
			counter = new BytecodeCounter();
			counter.setClassToInstrument(classFileBuffer);
			counter.setInstrumentationParams(params);
			counter.instrument();
			byte[] b = counter.getInstrumentedBytes();
			long stopTime = System.nanoTime();
			System.err.println("END OF INSTRUMENTATION: " + stopTime);
			System.err.println("INSTRUMENTATION DURATION: " + (stopTime-startTime) + "ns");

			return b;
		} else {
			return null;
		}
	}
	
	/**
	 * Checks whether the class with the name className has to be instrumented 
	 * based on the MethodDescriptors in params.
	 * @param className The class name to check.
	 * @param params The {@link InstrumentationParameters} specifying the 
	 * methods to instrument are used to determine whether the class has to 
	 * be instrumented.
	 * @return True if the class has to be instrumented, false otherwise.
	 */
	private boolean isClassToInstrument(String className,
			InstrumentationParameters params) {
		
		List<MethodDescriptor> methods = params.getMethodsToInstrument();
		for(int i = 0; i < methods.size(); i++) {
			// invariant: all methods that have been checked are not in the 
			// class with name className
			if(className.equals(
					methods.get(i).getCanonicalClassName().replace('.', '/'))) {
				return true;
			}
		}

		return false;
	}
	
	/**
	 * Called by the gui to set the methods to instrument and instrumentation 
	 * options.
	 * @param params {@link InstrumentationParameters} for ByCounter.
	 */
	private void setInstrumentationParameters(InstrumentationParameters params) {
		this.instrumentationParameters = params;
	}

	/**
	 * Replaces a class if it matches.
	 * @see java.lang.instrument.ClassFileTransformer#transform(java.lang.ClassLoader, java.lang.String, java.lang.Class, java.security.ProtectionDomain, byte[])
	 */
	@Override
	public byte[] transform(ClassLoader classLoader, 
			String className, 
			Class<?> classBeingRedefined,
			ProtectionDomain protectionDomain, 
			byte[] classFileBuffer)
			throws IllegalClassFormatException {
		
		byte[] transformedBytes = null;
		
		// Select how to get the instrumented files
		if(instrumentFromFileSystem) {
			transformedBytes = instrumentFromFilesystem(className);
		} else {
			transformedBytes = instrumentWithByCounter(className, 
				classFileBuffer, getInstrumentationParameters());
		}

        // null is the valid return value for "no transformation"
		return transformedBytes;
	}
}
