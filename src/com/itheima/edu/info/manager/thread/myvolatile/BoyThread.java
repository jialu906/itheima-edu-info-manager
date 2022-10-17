package com.itheima.edu.info.manager.thread.myvolatile;

public class BoyThread extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Money.money=Money.money-1000;
        System.out.println(Money.money);
    }
}
