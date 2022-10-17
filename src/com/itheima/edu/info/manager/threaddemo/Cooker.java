package com.itheima.edu.info.manager.threaddemo;

public class Cooker extends Thread{
    @Override
    public void run() {
        while(true){
            synchronized (Desk.lock){
                if(Desk.cout==0){
                    break;
                }else{
                    if(!Desk.flag){
                        System.out.println("生产");
                        Desk.flag=true;
                        Desk.lock.notifyAll();
                    }else {
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
