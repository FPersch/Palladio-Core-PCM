package de.fzi.softsec.maliciousplatform;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.jar.Attributes;
import java.util.jar.JarFile;
import java.util.jar.Manifest;

// Referenced classes of package de.fzi.softsec.maliciousplatform:
//            Component

public class MaloryPlatform
{
    public static final String MANIFEST = "META-INF/MANIFEST.MF";
    public static final String STARTER = "FZIExecPlatform-Starter";
    
    public MaloryPlatform()
    {
    }

    private String getStarterCLassName(String archiveToRun)
    {
        String starterClassName = "";
        try
        {
            if(archiveToRun != null && !"".equals(archiveToRun))
            {
                JarFile jarToRun = new JarFile(archiveToRun);
                java.util.jar.JarEntry manifestEntry = jarToRun.getJarEntry(MaloryPlatform.MANIFEST);
                java.io.InputStream iStream = jarToRun.getInputStream(manifestEntry);
                Manifest mf = new Manifest(iStream);
                Attributes atts = mf.getMainAttributes();
                starterClassName = atts.getValue(MaloryPlatform.STARTER);
            }
        }
        catch(IOException exc)
        {
            exc.printStackTrace();
        }
        return starterClassName;
    }

    private void startClass(String archiveToRun, String className)
    {
        try
        {
            if(className == null || "".equals(className))
            {
                System.out.println("Starter Class Name not defined.");
            } else
            {
                Component comp = new Component(archiveToRun);
                comp.start(className);
            }
        }
        catch(ClassNotFoundException exc)
        {
            exc.printStackTrace();
        }
        catch(NoSuchMethodException exc)
        {
            exc.printStackTrace();
        }
        catch(InvocationTargetException exc)
        {
            exc.printStackTrace();
        }
        catch(IllegalAccessException exc)
        {
            exc.printStackTrace();
        }
        catch(InstantiationException exc)
        {
            exc.printStackTrace();
        }
    }

    public static void main(String args[])
    {
        System.out.println("-- Welcome to Malory's Platform --");
        String archiveToRun = args[0];
        System.out.println((new StringBuilder(">> Run archive: ")).append(archiveToRun).toString());
        MaloryPlatform badEnvironment = new MaloryPlatform();
        String starterClassName = badEnvironment.getStarterCLassName(archiveToRun);
        badEnvironment.startClass(archiveToRun, starterClassName);
    }
}
