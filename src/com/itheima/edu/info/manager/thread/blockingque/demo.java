package com.itheima.edu.info.manager.thread.blockingque;

import com.itheima.edu.info.manager.threaddemo.Foodie;

import java.util.concurrent.ArrayBlockingQueue;

public class demo {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> abq=new ArrayBlockingQueue<>(1);
        Cooker c=new Cooker(abq);
        fooder f=new fooder(abq);
        c.start();
        f.start();
    }
}
