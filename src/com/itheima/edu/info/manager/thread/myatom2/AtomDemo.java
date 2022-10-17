package com.itheima.edu.info.manager.thread.myatom2;

public class AtomDemo implements Runnable{
    private volatile int count=0;
    private Object o=new Object() ;
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            synchronized (o) {
                count++;
            }
            System.out.println("已经送了"+count+"个ice");
        }
    }
}

