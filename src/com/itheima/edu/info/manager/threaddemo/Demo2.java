package com.itheima.edu.info.manager.threaddemo;

public class Demo2 {
    public static void main(String[] args) {

        Foodie f=new Foodie();
        Cooker c=new Cooker();
        f.start();
        c.start();
    }
}
