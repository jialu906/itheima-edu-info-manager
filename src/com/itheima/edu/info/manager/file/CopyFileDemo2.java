package com.itheima.edu.info.manager.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CopyFileDemo2 {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("C:\\Users\\Administrator\\Desktop\\New Text Document.txt");
        BufferedReader bf=new BufferedReader(fr);
        String s;
        while((s=bf.readLine())!=null) {
            System.out.println(s);
        }

        bf.close();
    }

    private static void extracted1() throws IOException {
        FileReader fr=new FileReader("C:\\Users\\Administrator\\Desktop\\New Text Document.txt");
        char[] ch=new char[1024];
        int len;
        while((len=fr.read(ch))!=-1){
            System.out.println(new String(ch,0,len));
        }
        fr.close();
    }

    private static void extracted() throws IOException {
        FileReader fr=new FileReader("C:\\Users\\Administrator\\Desktop\\New Text Document.txt");
        int ch;
        while((ch=fr.read())!=-1){
            System.out.println((char)ch);
        }
        fr.close();
    }

}