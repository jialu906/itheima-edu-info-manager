package com.itheima.edu.info.manager.threaddemo;

public class Myrunable1 implements Runnable{

    private int ticket=100;
    Object ob=new Object();
    @Override
    public void run() {

            while (true) {
                extracted();
            }
    }

    private synchronized void extracted() {
        if(ticket>0){
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + "==" + ticket);
        ticket--;
    }
    }
}
