package com.itheima.edu.info.manager.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInput {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:\\test.txt"));
        User u = (User)ois.readObject();
        System.out.println(u);
        ois.close();
    }
}
