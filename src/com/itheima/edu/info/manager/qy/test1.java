package com.itheima.edu.info.manager.qy;

public class test1 {
    public static void main(String[] args) {
        useinter(new inter1() {
            @Override
            public void show(String msg) {
                System.out.println("heima"+msg);
            }
        });
        useinter((String msg)->{System.out.println("heima"+msg);});
    }

    public static void useinter(inter1 i){
        i.show("sout");
    }
}


interface inter1{
    public abstract void show(String msg);
}