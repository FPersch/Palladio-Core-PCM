package de.uka.ipd.sdq.ByCounter.instrumentation;

import java.util.ArrayList;
import java.util.List;
import org.objectweb.asm.Opcodes;


/**
 * Additional information about opcodes gathered from their parameters.
 * TODO clarify: once class instance per occurence, or all occurences in one instance?
 * @author Martin Krogmann
 *
 */
public class AdditionalOpcodeInformation {
	
	/**
	 * This is a list of opcodes for which a place in the additional
	 * information arrays is reserved.
	 * @see protocolCount()
	 */
	public static final int[] OPCODES_STORING_ADDITIONAL_INFORMATION = 
		new int[] {
			Opcodes.ANEWARRAY,
			Opcodes.MULTIANEWARRAY,
			Opcodes.NEWARRAY
		};
	
	/**
	 * This integer signals that it holds no information. //MK TODO what is meant by "it"?
	 */
	public static final int NO_INFORMATION_INT = -1;
	
	/**
	 * This string signals that it holds no information. //MK TODO what is meant by "it"? 
	 */
	public static final String NO_INFORMATION_STRING = "";
	
	// Attributes:

	private List<String> foundMethodInvocations;
	private List<Integer> intInformation;
	private List<String> stringInformation;

	/**
	 * Construct empty AdditionalOpcodeInformation.
	 */
	public AdditionalOpcodeInformation() {

		foundMethodInvocations = new ArrayList<String>();
		intInformation = new ArrayList<Integer>();
		stringInformation = new ArrayList<String>();
	}
	
	/**
	 * Construct AdditionalOpcodeInformation with the given parameters.
	 * Make sure that intInformation and stringInformation have the same size.
	 * @param foundMethodInvStrings Method descriptors.
	 * @param intInformation Information as integer. Examples: array dimension, 
	 * array element type, etc.
	 * @param stringInformation Information as integer. Could be type 
	 * descriptors for array construction.
	 */
	public AdditionalOpcodeInformation(
			String[] foundMethodInvStrings, 
			int[] intInformation,
			String[] stringInformation) {

		foundMethodInvocations = new ArrayList<String>(foundMethodInvStrings.length);
		for(int i = 0; i < foundMethodInvStrings.length; i++) { //MK TODO what if param = null?
			foundMethodInvocations.add(foundMethodInvStrings[i]);
		}
		assert intInformation.length == stringInformation.length; //MK What about null?
		for(int i = 0; i < intInformation.length; i++) {
			this.intInformation.add(intInformation[i]);
			this.stringInformation.add(stringInformation[i]);			
		}
	}
	
	/**
	 * Add additional information entry.
	 * Int and String information is always coupled.
	 * If no information is to be stored, use NO_INFORMATION_*. 
	 * @param i Integer information.
	 * @param s String information.
	 */
	public void addAdditionalInformation(int i, String s) {
		this.intInformation.add(i);
		this.stringInformation.add(s);
	}

	/**
	 * Check whether the specified information tuple (integer, s) exists
	 * and return its index if it does.
	 * @param integer Integer information.
	 * @param s String information.
	 * @return The index when found. -1 if not found.
	 */
	public int getIndexOfAdditionInformation(int integer, String s) {
		assert intInformation.size() == stringInformation.size();
		for(int i = 0; i < intInformation.size(); i++) {
			if(intInformation.get(i) == integer
					&& stringInformation.get(i).equals(s)) {
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * Always connected to the string information with the same index.
	 * @return return A list of ints possibly containing opcode parameter information.
	 */
	public int[] getIntInformation() {
		int[] result = new int[intInformation.size()];
		for(int i = 0; i < intInformation.size(); i++) {
			result[i] = intInformation.get(i);
		}
		return result;
	}
	
	/**
	 * Get the list containing all method signatures that were called in the 
	 * visited method.
	 * @return A map containing method signatures as keys in the form 
	 * <code>owner + "." + name + desc</code>. Signatures are specific to 
	 * the object they are invoked on. This means that a certain methods 
	 * may be more than once in the array. However, their signatures differ, 
	 * as the owner property differs.
	 * @see constructObjectMethodSignature
	 */
	public List<String> getMethodInvokations() {
		return foundMethodInvocations;
	}
	
	/**
	 * 
	 * Always connected to the int information with the same index.
	 * @return A list of strings possibly containing opcode parameter information.
	 */
	public List<String> getStringInformation() {
		return stringInformation;
	}
}
