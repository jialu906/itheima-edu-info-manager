package com.itheima.edu.info.manager.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<>();
        hs.add("hello");
        hs.add("java");
        hs.add("programmer");
        hs.add("programmer");
        hs.add("programmer");
        hs.add("programmer");
        Iterator<String> it=hs.iterator();
        while(it.hasNext()){
            it.next();
        }
        for (String h : hs) {
            System.out.println(h);
        }

    }
}
