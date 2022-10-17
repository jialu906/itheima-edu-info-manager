package com.itheima.edu.info.manager.thread.threadpool;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
