package com.itheima.edu.info.iter.tcpdemo2;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class TcpClient {
    public static void main(String[] args) throws IOException {
        Socket sc=new Socket(InetAddress.getLocalHost(),10086);
        //OutputStream outputStream = sc.getOutputStream();
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        //封装输出流对象 outputstreamwriter封装成
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(sc.getOutputStream()));
        String line;
        while(true){
            line = bf.readLine();
            if("886".equals(line)){
                break;
            }
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        sc.close();

    }
}
