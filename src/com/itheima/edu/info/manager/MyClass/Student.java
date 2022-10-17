package com.itheima.edu.info.manager.MyClass;

public class Student implements Comparable<Student>{
    private String name;
    private int age;
    public Student(String name,int age)
    {
        this.age=age;
        this.name=name;
    }

    @Override
    public int compareTo(Student o) {
        int num=this.age-o.age;
        num=num == 0?this.name.compareTo(o.name):num;
        return num;
    }

    @Override
    public String toString() {
        return "{"+this.age+","+this.name+"}";
    }

    public int getage()
    {
        return this.age;
    }

    public String getname()
    {
        return this.name;
    }

}
