package com.itheima.edu.info.manager.stream;

public class Actor {
    private int age;
    private String name;

    public Actor(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

