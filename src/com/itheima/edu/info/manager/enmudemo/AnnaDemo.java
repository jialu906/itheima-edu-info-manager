/*
 * Copyright (C.Lo dt) ("2022年"-"10月"-"7点"-"51分")
 * Jiaqian_Lu Java test demo&&practice
 */

package com.itheima.edu.info.manager.enmudemo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnaDemo {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Class aClass = Class.forName("com.itheima.edu.info.manager.enmudemo.UseTest");
        UseTest o = (UseTest)aClass.newInstance();
        Method[] declaredMethods = aClass.getDeclaredMethods();

        for (Method declaredMethod : declaredMethods) {
            if(declaredMethod.isAnnotationPresent(anntest.class)){
                declaredMethod.invoke(o);
            }
        }
    }
}
