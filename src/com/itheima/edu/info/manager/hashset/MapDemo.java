package com.itheima.edu.info.manager.hashset;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "sunbin1");
        map.put(2, "sunbin2");
        map.put(3, "sunbin3");
        extracted(map);
        //map集合中装的是键值对对象
        //entry中装的是键和值
        extracted12(map);
    }

    private static void extracted12(Map<Integer, String> map) {
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + "---" + entry.getValue());
        }
    }
    private static void extracted1(Map<String, String> map) {
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + "---" + entry.getValue());
        }
    }

    private static void extracted(Map<Integer, String> map) {
        Set<Integer> set = map.keySet();
        for (Integer integer : set) {
            String s = map.get(integer);
            System.out.println(integer+"----"+s);
        }
    }
}