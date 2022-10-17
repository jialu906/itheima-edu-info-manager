package com.itheima.edu.info.iter.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClient {
    public static void main(String[] args) throws IOException {
        Socket sclient=new Socket(InetAddress.getLocalHost(),10086);
        OutputStream outputStream = sclient.getOutputStream();
        outputStream.write("this is a test".getBytes());
        outputStream.close();
    }
}
