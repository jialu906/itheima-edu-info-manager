package com.itheima.edu.info.manager.map;

import java.util.Map;

public class TreeMap {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        int num=sum1(arr);
        System.out.println(num);
    }

    private static int sum1(int[] arr) {
        int sum=0;
        for (int i : arr) {
            sum+=i;
        }
        return sum;
    }
    public int getsum(int...a){
        int sum=0;
        return sum;
    }

}
