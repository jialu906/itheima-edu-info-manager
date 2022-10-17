package com.itheima.edu.info.manager.collectiontest;

import java.util.Comparator;
import java.util.TreeSet;

public class MyTreeSet1 {
    public static void main(String[] args) {
        TreeSet<String> ts=new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int result=o1.length()-o2.length();
                return result=result==0?o1.compareTo(o2):result;
            }
        });
        ts.add("c");
        ts.add("ab");
        ts.add("q");
        ts.add("wd");
        System.out.println(ts);
    }
}
