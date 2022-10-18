/*
 * Copyright (C.Lo dt) ("2022年"-"10月"-"6点"-"22分")
 * Jiaqian_Lu Java test demo&&practice
 */

package com.itheima.edu.info.manager.enmudemo;

public enum Demo1 {
    spring("春"){
        public void show(){
            System.out.println(this.name());
        }
    },summer("夏"){
        public void show(){
            System.out.println(this.name());
    }},fall("秋"){
            public void show(){
                System.out.println(this.name());
    }},winter("冬"){
                public void show(){
                    System.out.println(this.name());
    }};



    //枚举也是一个类 可以定义成员变量
    public String name;
    private Demo1(String name){
        this.name=name;
    }
    public abstract void show();
}
