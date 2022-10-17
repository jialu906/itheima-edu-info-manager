package com.itheima.edu.info.iter.ipaddr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class SendDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket send=new DatagramSocket();
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String len;
        while((len=bf.readLine())!=null) {
            if ("886".equals(len)) {
                break;
            }
            byte[] bytes = len.getBytes();
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length, InetAddress.getLocalHost(), 10086);
            send.send(dp);
        }
        send.close();
    }
}
