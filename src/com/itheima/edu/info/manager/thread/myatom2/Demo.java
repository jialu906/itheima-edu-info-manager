package com.itheima.edu.info.manager.thread.myatom2;

public class Demo {
    public static void main(String[] args) {
        AtomDemo d=new AtomDemo();
        for (int i = 0; i < 100; i++) {
            new Thread(d).start();
        }
    }
}
