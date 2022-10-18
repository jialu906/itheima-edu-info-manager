/*
 * Copyright (C.Lo dt) ("2022年"-"10月"-"8点"-"29分")
 * Jiaqian_Lu Java test demo&&practice
 */

package com.itheima.edu.info.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Demo2 {

    @After
    public void fun1()
    {
        System.out.println("before");
    }

    @Test
    public void fun2()
    {
        System.out.println("test");
    }

    @After
    public void fun3()
    {
        System.out.println("after");
    }

}
