package com.itheima.edu.info.manager.thread.myatom3;

import java.util.concurrent.atomic.AtomicInteger;

public class MyAtom {
    public static void main(String[] args) {
        AtomicInteger ai=new AtomicInteger();
        ai.getAndIncrement();
        System.out.println(ai);
    }
}
