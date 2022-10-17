package com.itheima.edu.info.iter.classloader;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ClassLoadDemo {
    public static void main(String[] args) throws IOException {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        InputStream resourceAsStream = systemClassLoader.getResourceAsStream("pro.properties");
        Properties pro=new Properties();
        pro.load(resourceAsStream);
        System.out.println(pro);
        resourceAsStream.close();
/*      ClassLoader parent = systemClassLoader.getParent();
        ClassLoader parent1 = parent.getParent();
        System.out.println(systemClassLoader);
        System.out.println(parent);
        System.out.println(parent1);*/
    }
}
