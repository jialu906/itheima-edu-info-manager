package com.itheima.edu.info.manager.thread.mycountdowmlunch;

import java.util.concurrent.CountDownLatch;

public class MainThread extends Thread{
    private CountDownLatch cdl;
    public MainThread(CountDownLatch cdl) {
        this.cdl=cdl;
    }

    @Override
    public void run() {
        try {
            cdl.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName()+"等待结束");
    }
}
