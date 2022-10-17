package com.itheima.edu.info.manager.thread.semaphore;

import com.itheima.edu.info.manager.thread.mycountdowmlunch.Thread1;

public class Demo {
    public static void main(String[] args) {
        MyRunable mr=new MyRunable();
        Thread t1=new Thread(mr);
        Thread t2=new Thread(mr);
        Thread t3=new Thread(mr);
        t1.start();
        t2.start();
        t3.start();
    }
}
