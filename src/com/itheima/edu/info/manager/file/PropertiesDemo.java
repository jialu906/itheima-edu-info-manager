package com.itheima.edu.info.manager.file;

import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
    public static void main(String[] args) {
        Properties pro=new Properties();
        pro.put("sunbin1","ccs1");
        pro.put("sunbin2","ccs2");
        pro.put("sunbin3","ccs3");
        Set<Object> objects = pro.keySet();
        for (Object object : objects) {
            System.out.println(object+"--"+pro.get(object));
        }
    }
}
