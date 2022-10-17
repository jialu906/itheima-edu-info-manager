package com.itheima.edu.info.manager.collectiontest;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String>ary=new ArrayList<>();
        ary.add("aaa");
        Object[] objects = ary.toArray();
        System.out.println(Arrays.toString(objects));
        String[] strings = ary.toArray(new String[ary.size()]);
        System.out.println(Arrays.toString(strings));
        ArrayList<String> test1 = test(new ArrayList<String>(), "a", "b", "c");
        System.out.println(test1);
        demo31<String> de=new demo31<>();
        de.method("gg");
        demo5 dm5=new demo5();
        dm5.method(5);
    }
    public static<E> ArrayList<E> test(ArrayList<E>list,E e1,E e2,E e3)
    {
        list.add(e1);
        list.add(e2);
        list.add(e3);
        return list;
    }
}
class demo2<E>
{
    public <E> E test2(E E1)
    {
        E a;
        a=E1;
        System.out.println("gg");
        return a;
    }

}
interface inter<E>
{
    public abstract E method(E e);
}

class demo31<E> implements inter<E>{

    @Override
    public E method(E e) {
        E a=e;
        System.out.println(e);
        return e;
    }
}


class demo5 implements inter<Integer>
{

    @Override
    public Integer method(Integer integer) {
        System.out.println(integer);
        return 1;
    }
}
