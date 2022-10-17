package com.itheima.edu.info.manager.thread.myvolatile;

public class GirlThread extends Thread{
    @Override
    public void run() {
        while(Money.money==100000){
            System.out.println("trust");
        }
        System.out.println("lair");
    }
}
