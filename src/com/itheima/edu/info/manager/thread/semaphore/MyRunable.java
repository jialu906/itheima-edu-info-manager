package com.itheima.edu.info.manager.thread.semaphore;

import java.util.concurrent.Semaphore;

public class MyRunable implements Runnable{
    private Semaphore sp=new Semaphore(2);
    @Override
    public void run() {
        try {
            sp.acquire();
            System.out.println("获得通行证");
            Thread.sleep(10000);
            sp.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
