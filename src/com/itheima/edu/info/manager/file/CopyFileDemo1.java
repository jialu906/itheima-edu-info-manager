package com.itheima.edu.info.manager.file;

import java.io.*;
import java.util.Arrays;

public class CopyFileDemo1 {
    public static void main(String[] args) throws IOException {
        byte[] bytes={-53, -17, -79, -13};
        System.out.println(CopyFileDemo1.toBinary(bytes));
        String str=new String(bytes,"GBK");
        System.out.println(str);
    }
    public static String toBinary(byte b[]) {
        StringBuffer sb = new StringBuffer();
        for (byte b1 : b) {
            for(int i = 0; i < 8; ++i) {
                sb.append((b1 & (1 << i)) > 0 ? 1 : 0);
            }
        }

        return sb.toString();
    }

    private static void fun1() throws UnsupportedEncodingException {
        String str="孙斌";
        byte[] bytes=str.getBytes();
        byte[] bytes2=str.getBytes("gbk");
        System.out.println(Arrays.toString(bytes));
        System.out.println(Arrays.toString(bytes2));
    }

    private static void extracted() throws IOException {
        FileInputStream fi=new FileInputStream("C:\\BaiduNetdiskDownload\\手表\\烧录器\\ESP01S.rar");
        FileOutputStream fo=new FileOutputStream("C:\\test2.rar");
        BufferedInputStream bf=new BufferedInputStream(fi);
        BufferedOutputStream bo=new BufferedOutputStream(fo);
        int b;
        while((b=bf.read())!=-1){
            bo.write(b);
        }
        bf.close();
        bo.close();
    }
}
