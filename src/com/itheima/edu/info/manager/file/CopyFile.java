package com.itheima.edu.info.manager.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fi=new FileInputStream("C:\\BaiduNetdiskDownload\\手表\\烧录器\\ESP01S.rar");
        FileOutputStream fo=new FileOutputStream("C:\\test.rar");
        int b=0;
        while((b=fi.read())!=-1){
            fo.write(b);
        }
        fi.close();
        fo.close();
    }
}
