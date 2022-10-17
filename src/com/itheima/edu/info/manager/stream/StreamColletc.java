package com.itheima.edu.info.manager.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamColletc {
    public static void main(String[] args) {
        extracted();
        ArrayList<String>list=new ArrayList<>(List.of("zhangsan,23","lisi,24","wangwu,25"));
        Stream<String> stream = list.stream();
        Map<String, Integer> collect = stream.filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                String[] split = s.split(",");
                int i = Integer.parseInt(split[1]);
                return i >= 24;
            }
        }).collect(Collectors.toMap(s -> {
            return s.split(",")[0];
        }, s -> {return Integer.parseInt(s.split(",")[1]);}));
        System.out.println(collect.entrySet());
    }

    private static void extracted() {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<=10;i++){
            list.add(i);
        }
        Set<Integer> collect = list.stream().filter(
                new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer integer) {
                        if(integer%2==0){
                            return true;
                        }
                        else return false;
                    }
                }).collect(Collectors.toSet());
        System.out.println(collect);
    }
}
