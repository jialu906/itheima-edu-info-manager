package com.itheima.edu.info.iter.socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
    public static void main(String[] args) throws IOException {
        ServerSocket socket=new ServerSocket(10086);
        Socket accept = socket.accept();
        InputStream inputStream = accept.getInputStream();

        byte[] bytes = new byte[1024];

        int read = inputStream.read(bytes);
        System.out.println(new String(bytes, 0, read));

        socket.close();
    }
}
