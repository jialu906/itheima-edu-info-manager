package com.itheima.edu.info.manager.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fo = new FileOutputStream(new File("C:\\code.txt"));
        byte bt[] = {97, 98, 99};

        try {
            //Integer num=2/0;
            fo.write(bt);
            fo.write("\r\n".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fo != null) {
                try {
                    fo.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
