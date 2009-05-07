package de.fzi.softsec.maliciousplatform;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Hashtable;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import de.fzi.softsec.compplatform.ComponentStarter;

public class Component extends ClassLoader
{
    private final String componentArchive;
    private Hashtable<String,Class<?>> classes;
    
    protected Component(String archive)
    {
        super(Component.class.getClassLoader());
        classes = new Hashtable<String,Class<?>>();
        componentArchive = archive;
    }

    private String getEntryNameFromClassName(String className)
    {
        String entryName = "";
        entryName = className.replace(".", "/").concat(".class");
        return entryName;
    }

    protected Class<?> loadClass(String name, boolean resolve)
        throws ClassNotFoundException
    {
        Class<?> clazz = null;
        try
        {
            ClassLoader parent = getParent();
            clazz = parent.loadClass(name);
        }
        catch(ClassNotFoundException exc)
        {
            clazz = findClass(name);
        }
        if(resolve && clazz != null)
            resolveClass(clazz);
        return clazz;
    }

    public Class<?> loadClass(String name)
        throws ClassNotFoundException
    {
        return loadClass(name, false);
    }

    private byte[] loadClassData(String className)
        throws IOException
    {
        JarFile componentJar = new JarFile(componentArchive);
        String entryName = getEntryNameFromClassName(className);
        JarEntry entry = (JarEntry)componentJar.getEntry(entryName);
        InputStream iStream = componentJar.getInputStream(entry);
        byte data[] = new byte[iStream.available()];
        DataInputStream dis = new DataInputStream(iStream);
        dis.readFully(data);
        dis.close();
        return data;
    }

    protected Class<?> findClass(String name)
        throws ClassNotFoundException
    {
        Class<?> clazz = (Class<?>)classes.get(name);
        if(clazz == null)
        {
            byte data[] = (byte[])null;
            try
            {
                data = loadClassData(name);
            }
            catch(IOException exc)
            {
                throw new ClassNotFoundException(exc.getMessage(), exc.getCause());
            }
            clazz = defineClass(name, data, 0, data.length);
            if(clazz != null)
                classes.put(name, clazz);
            else
                System.out.println((new StringBuilder("class ")).append(name).append(" not found.").toString());
        }
        return clazz;
    }

    private void startClass(Class<?> clazz)
        throws NoSuchMethodException, InstantiationException, InvocationTargetException, IllegalAccessException
    {
        Class<?> params[] = new Class[0];
        Method myMethod = clazz.getDeclaredMethod("start", params);
        Object obj = clazz.newInstance();
        if(obj instanceof ComponentStarter)
        {
            ComponentStarter starter = (ComponentStarter)obj;
            myMethod.invoke(starter, (Object[])null);
        } else
        {
            System.out.println((new StringBuilder("Starter Class ")).append(clazz.getName()).append(" is not of type ").append(ComponentStarter.class.getName()).toString());
        }
    }

    protected void start(String className)
        throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException
    {
        Class<?> class1 = loadClass(className);
        System.out.println(">> Ready to start component !");
        startClass(class1);
    }

    protected void stop()
    {
        System.out.println("TODO: Stop Component");
    }
}
