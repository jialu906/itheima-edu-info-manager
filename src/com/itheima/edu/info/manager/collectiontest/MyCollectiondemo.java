package com.itheima.edu.info.manager.collectiontest;

import java.util.*;

public class MyCollectiondemo {
    public static void main(String[] args) {
        extracted();
        ArrayList<String> list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("e");
        list.add("f");
        list.iterator();
    }

    private static void extracted() {
        Collection<String> collection=new ArrayList<>();
        collection.add("a");
        collection.add("b");
        collection.add("c");
        collection.add("d");
        collection.add("e");

        Iterator<String> it=collection.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
