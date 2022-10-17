package com.itheima.edu.info.manager.thread;

public class Demo1 {
    public static void main(String[] args) {
        MyRunable1 mr1=new MyRunable1();
        MyRunable1 mr2=new MyRunable1();
        Thread t1=new Thread(mr1);
        Thread t2=new Thread(mr2);
        t1.start();
        t2.start();
        while(true){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
