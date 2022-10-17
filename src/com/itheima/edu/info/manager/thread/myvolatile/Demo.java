package com.itheima.edu.info.manager.thread.myvolatile;

public class Demo {
    public static void main(String[] args) {
        BoyThread bt=new BoyThread();
        GirlThread gt=new GirlThread();
        gt.start();
        bt.start();
    }
}
