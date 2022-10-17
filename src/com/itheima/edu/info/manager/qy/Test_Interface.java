package com.itheima.edu.info.manager.qy;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test_Interface {

    public static void main(String[] args) {
        Date d1=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
        String format = sdf.format(d1);
        System.out.println(format);

        new My_Interface(){
            public void  Show_Message(){
                System.out.println("hello");
            }
        }.Show_Message();

        Fun_Use_Interface(new My_Interface() {
            @Override
            public void Show_Message() throws NullPointerException {
                System.out.println("hello");
                System.out.println(Integer.MAX_VALUE);
                //Integer i1=new Integer(100);
                Integer i2=Integer.valueOf(100);
            }
        });

        Fun_Use_Interface(()->{
            System.out.println("hello");
        });
    }

    static void Fun_Use_Interface(My_Interface Inter){
        Inter.Show_Message();
    }
}


interface My_Interface{
    public abstract void Show_Message();
}
