package com.itheima.edu.info.manager.thread.blockingque;

import java.util.concurrent.ArrayBlockingQueue;

public class Cooker extends Thread{
    private ArrayBlockingQueue q;
    Cooker(ArrayBlockingQueue q){
        this.q=q;
    }
    @Override
    public void run() {
        while(true){
            try {
                q.put("huam");
                System.out.println("add hamburger");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
