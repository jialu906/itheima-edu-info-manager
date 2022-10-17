package com.itheima.edu.info.iter.classloader;

import java.lang.reflect.Field;

public class ReflectDemo3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException {
        Class aClass = Class.forName("com.itheima.edu.info.iter.classloader.Student");

        Field[] fields = aClass.getFields();
        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i]);
        }

        Field field = aClass.getField("gender");
        System.out.println(field);

        //获取私有成员变量 取消访问限制
        Field name = aClass.getDeclaredField("name");
        System.out.println(name);
        name.setAccessible(true);

        //获取student的字节码 强转类型
        Student s = (Student)Class.forName("com.itheima.edu.info.iter.classloader.Student").newInstance();
        //field.set(s,"gender");
        System.out.println(s);

        //设置student类对象s的name属性
        name.set(s,"sunbin");
        System.out.println(s);
    }
}
