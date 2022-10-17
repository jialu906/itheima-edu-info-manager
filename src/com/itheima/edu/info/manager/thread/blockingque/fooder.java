package com.itheima.edu.info.manager.thread.blockingque;

import java.util.concurrent.ArrayBlockingQueue;

public class fooder extends Thread{
    private ArrayBlockingQueue<String> q;

    public fooder(ArrayBlockingQueue<String> q) {
        this.q = q;
    }

    @Override
    public void run() {
        while(true){
            try {
                System.out.println(q.take());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
