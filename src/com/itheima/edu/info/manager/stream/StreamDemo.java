package com.itheima.edu.info.manager.stream;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        //extracted();
        //extracted1();
        //extracted2();
        extracted();

    }

    private static void extracted2() {
        int num[]={1,2,3,4,5};
        Arrays.stream(num).forEach(s-> System.out.println(s));
    }

    private static void extracted1() {
        HashMap<Integer,String>map=new HashMap<Integer, String>(Map.of(1,"sunbin",2,"zhangsan"));
        //map.keySet().stream().forEach(s-> System.out.println(s));
        map.entrySet().stream().forEach(s-> System.out.println(s));
    }

    private static void extracted() {
        ArrayList<String> list = new ArrayList<>(List.of("endia","valor","camstar"));
        Stream<String> stream = list.stream();
        long count = stream.count();
        List<String> strlist=new List<String>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<String> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(String s) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends String> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends String> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public String get(int index) {
                return null;
            }

            @Override
            public String set(int index, String element) {
                return null;
            }

            @Override
            public void add(int index, String element) {

            }

            @Override
            public String remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<String> listIterator() {
                return null;
            }

            @Override
            public ListIterator<String> listIterator(int index) {
                return null;
            }

            @Override
            public List<String> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        strlist.add("gg");
        //stream.filter(s->s.startsWith("en")).forEach(s-> System.out.println(s));
        //list.forEach((s)-> {System.out.println(s);});
        //stream.forEach(m-> System.out.println(m));

//        stream.filter(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                boolean s1 = s.startsWith("g");
//                return s1;
//            }
//        }).forEach(s-> System.out.println(s));
//    }
    }
}

