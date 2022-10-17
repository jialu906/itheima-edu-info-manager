package com.itheima.edu.info.iter.tcpdemo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket sc=new Socket(InetAddress.getLocalHost(),10086);
        OutputStream outputStream = sc.getOutputStream();
        outputStream.write("前程".getBytes());
        byte []bytes=new byte[1024];
        InputStream inputStream = sc.getInputStream();
        int len=inputStream.read(bytes);
        System.out.println(new String(bytes,0,len));
        sc.close();
    }
}
