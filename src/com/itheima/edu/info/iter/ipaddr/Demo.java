package com.itheima.edu.info.iter.ipaddr;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Demo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress iad=InetAddress.getByName("localhost");
        String address = iad.getHostAddress();
        String hostName = iad.getHostName();
        System.out.println(address+" "+hostName);

    }
}
