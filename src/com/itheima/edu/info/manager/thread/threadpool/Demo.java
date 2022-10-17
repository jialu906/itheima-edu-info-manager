package com.itheima.edu.info.manager.thread.threadpool;

import java.util.concurrent.*;

public class Demo {
    public static void main(String[] args) {
        extracted();
        ThreadPoolExecutor pool=new ThreadPoolExecutor(2,5,2, TimeUnit.SECONDS,new ArrayBlockingQueue<Runnable>(10),Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
        pool.submit(new MyRunnable());
    }

    private static void extracted() {
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName());
        });

        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName());
        });
        executorService.shutdown();
    }
}
