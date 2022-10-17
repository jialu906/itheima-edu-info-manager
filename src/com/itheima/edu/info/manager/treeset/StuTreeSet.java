package com.itheima.edu.info.manager.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class StuTreeSet {
    public static void main(String[] args) {
        TreeSet<Student> stu=new TreeSet<>();
        Student stu1=new Student("sunbin1",10,20,30);
        Student stu2=new Student("sunbin2",10,30,30);
        Student stu3=new Student("sunbin3",10,30,40);
        stu.add(stu1);
        stu.add(stu2);
        stu.add(stu3);
        System.out.println(stu);
    }
}
