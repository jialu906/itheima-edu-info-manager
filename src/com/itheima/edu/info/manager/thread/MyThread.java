package com.itheima.edu.info.manager.thread;

public class MyThread extends Thread {

    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
       /* for (int i = 0; i < 100; i++) {
            System.out.println("开启了"+i+"次");
        }*/
        String name=getName();
        System.out.println(name);
        String name1 = Thread.currentThread().getName();
        System.out.println(name1);

    }
}
