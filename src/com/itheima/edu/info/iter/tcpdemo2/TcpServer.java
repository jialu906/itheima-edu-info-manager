package com.itheima.edu.info.iter.tcpdemo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(10086);
        Socket accept = ss.accept();
        InputStream inputStream = accept.getInputStream();
        BufferedReader bf=new BufferedReader(new InputStreamReader(inputStream));
        String line;
        while((line= bf.readLine())!=null){
            System.out.println(line);
        }
        accept.close();
    }
}
