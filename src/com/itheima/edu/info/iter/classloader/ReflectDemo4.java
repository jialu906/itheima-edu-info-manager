package com.itheima.edu.info.iter.classloader;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo4 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        //Class.forName("com.itheima.edu.info.iter.classloader.Student").newInstance()
        Class aClass = Class.forName("com.itheima.edu.info.iter.classloader.Student");

        //获取公共方法 包含继承关系
        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        //获取所有方法 不包含继承关系
        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }

        Method setAge = aClass.getMethod("setAge", int.class);

        //调用方法
        Student oss = (Student) aClass.newInstance();
        setAge.invoke(oss,18);
        System.out.println(oss);
    }
}
