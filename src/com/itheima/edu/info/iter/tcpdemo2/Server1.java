package com.itheima.edu.info.iter.tcpdemo2;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Server1 {
    public static void main(String[] args) throws IOException {
        ThreadPoolExecutor pool=new ThreadPoolExecutor(3,10,60, TimeUnit.SECONDS, new ArrayBlockingQueue<>(7), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
        ServerSocket ss=new ServerSocket(10086);
        while(true){
            Thread thread = new Thread(new ServerThread(ss));
            pool.submit(thread);

        }
    }
}
