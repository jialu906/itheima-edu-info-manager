package com.itheima.edu.info.iter.classloader;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class aClass = Class.forName("com.itheima.edu.info.iter.classloader.Student");
        //返回所有公共
        Constructor[] constructors = aClass.getConstructors();
        //返回空参
        Constructor constructor1 = aClass.getConstructor();
        //返回所有
        Constructor[] declaredConstructors = aClass.getDeclaredConstructors();
        //返回String参数的
        Constructor constructor2 = aClass.getConstructor(String.class);
        //返回一个私有的,被private修饰的成员变量需要设置setAccessible；取消临时检查访问。
        Constructor declaredConstructor = aClass.getDeclaredConstructor(int.class,String.class);
        declaredConstructor.setAccessible(true);

        Student sb =(Student) declaredConstructor.newInstance(12, "孙斌");
        System.out.println(sb);
    }
}
