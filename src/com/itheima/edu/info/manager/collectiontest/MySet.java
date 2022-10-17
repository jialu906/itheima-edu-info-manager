package com.itheima.edu.info.manager.collectiontest;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.Set;

public class MySet {
    public static void main(String[] args) {
        Set<String> mySet =new TreeSet<>();
        mySet.add("aaa");
        mySet.add("bbb");
        System.out.println(mySet);
        Iterator<String> it=mySet.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        for (String s : mySet) {
            System.out.println(s);
        }
    }
}
