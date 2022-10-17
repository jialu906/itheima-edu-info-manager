package com.itheima.edu.info.manager.thread.mycountdowmlunch;

import java.util.concurrent.CountDownLatch;

public class Demo {
    public static void main(String[] args) {
        CountDownLatch cdl=new CountDownLatch(2);
        Thread1 t1=new Thread1(cdl);
        Thread1 t2=new Thread1(cdl);
        MainThread t=new MainThread(cdl);
        t.start();
        t1.start();
        t2.start();

    }
}
