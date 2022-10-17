package com.itheima.edu.info.manager.collectiontest;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Number> list2=new ArrayList<>();
        ArrayList<Object> list3=new ArrayList<>();
        test1(list1);
        test1(list2);
        //test1(list3);
    }
    //传递Number Number所有子类
    public static void test1(ArrayList<? extends Number> list)
    {

    }
    //传递Number类型或者父类类型
    public static void test2(ArrayList<? super Number> list)
    {

    }

}
