package com.itheima.edu.info.iter.tcpdemo2;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class Client1 {
    public static void main(String[] args) throws IOException {
        Socket sc=new Socket(InetAddress.getLocalHost(),10086);
        //OutputStream outputStream = sc.getOutputStream();
        String src="C:\\Users\\Administrator\\Desktop\\itheima-edu-info-manager\\src\\com\\itheima\\edu\\info\\iter\\tcpdemo2\\test.txt";
        BufferedReader bf=new BufferedReader(new FileReader(src));
        BufferedReader bf1=new BufferedReader(new InputStreamReader(sc.getInputStream()));
        //封装输出流对象 outputstreamwriter封装成
        String line;
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(sc.getOutputStream()));
        while ((line= bf.readLine())!=null) {
            if("886".equals(line)){
                break;
            }
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        sc.shutdownOutput();
        String str=bf1.readLine();
        System.out.println(str);
        bf.close();
        bufferedWriter.close();
        sc.close();
    }
}
