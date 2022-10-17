package com.itheima.edu.info.manager.file;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class SavePropreties {
    public static void main(String[] args) throws IOException {
        Properties pro=new Properties();
        pro.put("sunbin1","121");
        pro.put("sunbin2","122");
        pro.put("sunbin3","123");
        FileWriter fr=new FileWriter("Pro.properties");
        pro.store(fr,"");
        fr.close();
    }
}
