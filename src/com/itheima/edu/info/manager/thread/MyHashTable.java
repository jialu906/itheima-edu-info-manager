package com.itheima.edu.info.manager.thread;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class MyHashTable {
    public static void main(String[] args) throws InterruptedException {
        HashMap<String,String>map=new HashMap<>();
        ConcurrentHashMap<String,String>ch=new ConcurrentHashMap<>();
        Thread t1=new Thread(()->{
            for (int i = 0; i < 25; i++) {
                map.put(i+"",i+"");
            }
        });
        Thread t2=new Thread(()->{
            for (int i = 25; i < 50; i++) {
                map.put(i+"",i+"");
            }
        });
        t1.start();
        t2.start();

        Thread.sleep(1000);


        for (int i = 0; i < 51; i++) {
            System.out.println(map.get(i+""));
        }
    }
}
