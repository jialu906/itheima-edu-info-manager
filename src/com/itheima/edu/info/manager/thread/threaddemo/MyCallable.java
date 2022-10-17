package com.itheima.edu.info.manager.thread.threaddemo;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String>{
    @Override
    public String call() throws Exception {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }

        //返回值表示线程运行之后的结果
        return "gg";
    }
}
