package com.itheima.edu.info.manager.qy;

public class MathDemo {
    public static void main(String[] args) {
        // ctrl + alt +v
        int abs = Math.abs(-10);
        System.out.println(abs);
        double ceil = Math.ceil(10.1);
        System.out.println(ceil);
        double floor = Math.floor(10.9);
        System.out.println(floor);
        long round = Math.round(10.1);
        System.out.println(round);
        long round1 = Math.round(1.9);
        System.out.println(round1);
        //shift enter
        int max = Math.max(10, 20);
        System.out.println(max);
        // crtl + alt +t
        for (int i=0;i<10;i++) {
            double random = Math.random();
            System.out.println(random);
        }
        int[] arry={1,2,3,4};
        int[] arry2=new int[10];
        System.arraycopy(arry,0,arry2,0,arry.length);
        for (int i = 0; i < arry2.length; i++) {
            System.out.println(arry2[i]);
        }
    }

}
