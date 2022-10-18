package com.itheima.edu.info.iter.classloader;


public class Student {
    private int age;
    private String name;
    public String gender;
    public int num=10;
    public Student() {

    }
    public Student(String name) {

    }

    private Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", num=" + num +
                '}';
    }
}
