package com.itheima.edu.info.manager.qy;

import java.util.LinkedList;

public class test {
    public static void main(String[] args) {
        new inter() {
            public void fun(String msg) {
                System.out.println("nickname1"+msg);
            }
        }.fun("heima");

        //匿名方法
        useshowhandler(new inter() {
            public void fun(String msg) {
                System.out.println("nickname2"+msg);
            }
        });

        //lamdba
        useshowhandler((String msg)->{System.out.println("lambda nickname"+msg);});
    }

    public static void useshowhandler(inter in){
        in.fun("heima");
    }
}

class outer{
    class inner{
        public void fun(){
            System.out.println("1");
        }
    }
}

interface inter{
    public abstract void fun(String msg);
}
