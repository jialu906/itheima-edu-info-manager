package com.itheima.edu.info.manager.collectiontest;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class MyCollection {
    public static void main(String[] args) {
        int []array={1,2,3,4};
        char []array2={'c','b','d'};
        String []array3={"a","b","d"};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
        //如果集合要存储基本数据类型 要存储包装类
        ArrayList<String> ar=new ArrayList<String>();
        ar.add("abd");

        ArrayList<Integer> ar1=new ArrayList<Integer>();
        ar1.add(1);
        extracted();
    }

    private static void extracted() {
        Collection <String> cn=new ArrayList<String>();
        cn.add("a");
        boolean a = cn.remove("a");
        System.out.println(a);
        extracted(cn);
    }

    private static void extracted(Collection<String> cn) {
        //boolean test(T t);
        cn.removeIf(
                (String s)-> {
                    return (s.length() == 3);
                }
        );
        System.out.println(cn);
    }
}
