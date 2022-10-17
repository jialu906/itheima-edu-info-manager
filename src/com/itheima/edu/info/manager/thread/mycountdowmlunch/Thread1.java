package com.itheima.edu.info.manager.thread.mycountdowmlunch;

import java.util.concurrent.CountDownLatch;

public class Thread1 extends Thread{
    private CountDownLatch cdl;
    public Thread1(CountDownLatch cdl) {
        this.cdl=cdl;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName()+"结束");
        cdl.countDown();
    }
}
