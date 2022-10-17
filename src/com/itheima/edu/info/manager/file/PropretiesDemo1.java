package com.itheima.edu.info.manager.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropretiesDemo1 {
    public static void main(String[] args) throws IOException {
        Properties pro=new Properties();
        FileReader fr=new FileReader("Pro.properties");
        pro.load(fr);
        fr.close();
        System.out.println(pro);
    }
}
