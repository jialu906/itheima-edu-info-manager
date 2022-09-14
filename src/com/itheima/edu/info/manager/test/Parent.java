package com.itheima.edu.info.manager.test;

public abstract  class Parent {
    Parent()
    {
        System.out.println("父类的构造方法");
    }
    public final void write()
    {
        System.out.println("start");
        say();
        System.out.println("end");
    }
    abstract void say();



}
