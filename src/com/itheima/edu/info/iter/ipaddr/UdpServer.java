package com.itheima.edu.info.iter.ipaddr;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpServer {
    public static void main(String[] args) throws IOException {
        DatagramSocket udp=new DatagramSocket(2022);
        byte [] bytes=new byte[1024];
        DatagramPacket dp=new DatagramPacket(bytes,bytes.length);
        udp.receive(dp);
        int len=dp.getLength();
        byte[] data = dp.getData();

        String datas=new String(data,0,len);
        System.out.println(datas);
        udp.close();

    }

}
