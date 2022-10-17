package com.itheima.edu.info.manager.threaddemo;

import java.util.concurrent.ArrayBlockingQueue;

public class Demo3 {
    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue<String> abq=new ArrayBlockingQueue<>(1);
        abq.put("哈密补个人");
        System.out.println(abq.take());
        System.out.println(abq.take());
    }
}
