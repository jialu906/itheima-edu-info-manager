/*
 * Copyright (C.Lo dt) ("2022年"-"10月"-"8点"-"44分")
 * Jiaqian_Lu Java test demo&&practice
 */

package com.itheima.edu.info.log4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Demo {
    //log4j的api来获取日志对象
    //弊端 更换日志实现类 下列代码都需要跟着改
    //不推荐使用
 /*   private static final Logger log;
      log = Logger.getLogger(Class.forName("com.itheima.edu.info.log4j.Demo"));
*/

    //使用sl4j的api来获取日志对象
    //好处：更换日志实现类，代码不需要修改
    private static final Logger log= LoggerFactory.getLogger(Demo.class);
    public static void main(String[] args) {
        log.debug("debug级别的日志");
        log.info("info级别的日志");
        log.warn("warn级别的日志");
        log.error("error级别的日志");
    }
}
