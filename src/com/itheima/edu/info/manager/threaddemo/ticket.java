package com.itheima.edu.info.manager.threaddemo;

public class ticket {
    public static void main(String[] args) {
        Myrunable1 m1=new Myrunable1();
        Thread t1=new Thread(m1);
        Thread t2=new Thread(m1);
        Thread t3=new Thread(m1);
        t1.start();
        t2.start();
        t3.start();
    }
}
