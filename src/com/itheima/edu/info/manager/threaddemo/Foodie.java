package com.itheima.edu.info.manager.threaddemo;

public class Foodie extends Thread{

    @Override
    public void run() {
        while(true){
            synchronized (Desk.lock){
                if(Desk.cout==0){
                    break;
                }else{
                    if(Desk.flag){
                        System.out.println("开吃");
                        Desk.flag=false;
                        Desk.lock.notifyAll();
                        Desk.cout--;
                    }else{
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }
    }
}
