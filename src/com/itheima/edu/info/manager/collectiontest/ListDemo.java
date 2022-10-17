package com.itheima.edu.info.manager.collectiontest;

import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("------------");
        for(String s:list){
            System.out.println(s);
        }

    }
}
