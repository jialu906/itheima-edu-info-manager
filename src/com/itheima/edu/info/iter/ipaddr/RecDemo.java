package com.itheima.edu.info.iter.ipaddr;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class RecDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket rec=new DatagramSocket(10086);
        while(true) {
            byte[] bytes = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
            rec.receive(dp);
            System.out.println(new String(dp.getData(), 0, dp.getLength()));
        }
    }
}
