package com.itheima.edu.info.manager.thread;

public class MyThread1 {
    public static void main(String[] args) {
        MyRunnable mr1=new MyRunnable();
        MyRunnable mr2=new MyRunnable();
        Thread t1=new Thread(mr1);
        Thread t2=new Thread(mr2);
        t1.start();
        t2.start();
    }
}
