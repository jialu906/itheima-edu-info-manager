package com.itheima.edu.info.manager.thread.threaddemo;

import java.util.concurrent.FutureTask;

public class Demo {
    public static void main(String[] args) {
        MyCallable mc=new MyCallable();
        FutureTask<String> ft=new FutureTask<>(mc);
        Thread t1=new Thread(ft);
        t1.start();
        MyCallable mc2=new MyCallable();
        FutureTask<String> ft2=new FutureTask<>(mc2);
        Thread t2=new Thread(ft);
        t2.start();
    }
}
