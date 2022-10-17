package com.itheima.edu.info.iter.classloader;

public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        //1
        Class aClass = Class.forName("com.itheima.edu.info.iter.classloader.Student");
        System.out.println(aClass);
        //2
        Class studentClass = Student.class;
        System.out.println(studentClass);
        //3
        Student s=new Student();
        Class<? extends Student> aClass1 = s.getClass();

    }
}
