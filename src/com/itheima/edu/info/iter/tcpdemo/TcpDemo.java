package com.itheima.edu.info.iter.tcpdemo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(10086);
        Socket accept = ss.accept();
        byte [] bytes=new byte[1024];
        InputStream inputStream = accept.getInputStream();
        int read = inputStream.read(bytes);
        System.out.println(new String(bytes,0,read));
        String str="接受到了数据";
        OutputStream outputStream = accept.getOutputStream();
        outputStream.write(str.getBytes());
        ss.close();

    }
}
