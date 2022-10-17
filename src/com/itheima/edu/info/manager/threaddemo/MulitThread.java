package com.itheima.edu.info.manager.threaddemo;

public class MulitThread {
    public static void main(String[] args) {
        Object oba = new Object();
        Object obb = new Object();
        new Thread(() -> {
            while (true) {
                synchronized (oba) {
                    synchronized (obb) {
                        System.out.println("小康");
                    }
                }
            }
        }).start();

        new Thread(() -> {
            while (true) {
                synchronized (obb) {
                    synchronized (oba) {
                        System.out.println("小为");
                    }
                }
            }
        }).start();
    }
}
