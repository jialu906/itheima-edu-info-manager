package com.itheima.edu.info.manager.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Mymap {
    public static void main(String[] args) {
        HashMap<Student,String> map=new HashMap<>();
        Student s1=new Student("xiaohei",23,"male");
        Student s2=new Student("dazhaung",28,"female");
        Student s3=new Student("xiaozhuang",23,"male");
        map.put(s1,"shannxi");
        map.put(s2,"beijing");
        map.put(s3,"tianjing");
        //1
        //extracted(map);
        //2
        //extracted1(map);
        //3
        map.forEach((Student s,String str)->{
            System.out.println(s+"--"+str);
        });
    }

    private static void extracted1(HashMap<Student, String> map) {
        Set<Map.Entry<Student,String>> entries= map.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            Student key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"----"+value);
        }
    }

    private static void extracted(HashMap<Student, String> map) {
        Set<Student>keys= map.keySet();
        for (Student key : keys) {
            String strs= map.get(key);
            System.out.println(key);
            System.out.println(strs);
        }
    }
}
