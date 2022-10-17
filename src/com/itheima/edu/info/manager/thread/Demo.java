package com.itheima.edu.info.manager.thread;

public class Demo {
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        MyThread t2=new MyThread();
        MyThread t3=new MyThread("sun");
        t1.setName("sunbin");
        t1.start();
        t2.start();
        t3.start();
        System.out.println(Thread.currentThread().getName());
    }
}
