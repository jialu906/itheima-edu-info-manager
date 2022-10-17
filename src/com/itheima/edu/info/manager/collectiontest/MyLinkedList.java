package com.itheima.edu.info.manager.collectiontest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class MyLinkedList<E>{
    private E str;
    public static void main(String[] args) {
        LinkedList<String>  list=new LinkedList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        Iterator<String> it=list.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        for(String str:list)
        {
            System.out.println(str);
        }

    }
}
class demo<E>
{
    private E str;

    public E getStr() {
        return str;
    }

    public void setStr(E str) {
        this.str = str;
    }

    ArrayList<String>ary=new ArrayList<>();
    public static void test()
    {

    }

}

