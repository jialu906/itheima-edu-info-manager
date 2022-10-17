package com.itheima.edu.info.iter.ipaddr;

import java.io.IOException;
import java.net.*;

public class UdpClient {
    public static void main(String[] args) throws IOException {
        DatagramSocket udp=new DatagramSocket();
        byte[] bytes="gg".getBytes();
        int len=bytes.length;
        InetAddress byName = InetAddress.getByName("localhost");
        int port=2022;
        DatagramPacket dp=new DatagramPacket(bytes,len,byName,port);
        udp.send(dp);
        udp.close();


    }
}
