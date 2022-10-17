package com.itheima.edu.info.manager.thread.myatom;

public class AtomDemo implements Runnable{
    private volatile int count=0;
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            count++;
            System.out.println("已经送了"+count+"个ice");
        }
    }
}

