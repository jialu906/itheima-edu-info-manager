package com.itheima.edu.info.manager.file;

import java.io.*;
import java.util.ArrayList;

public class ObjectDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        extracted2();
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:\\test2.txt"));
        Object o = ois.readObject();
        System.out.println(o);
        ois.close();
    }

    private static void extracted2() throws IOException {
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("C:\\test2.txt"));
        Object u;
        User u1=new User("sunbin","123");
        User u2=new User("sunbin1","123");
        User u3=new User("sunbin2","123");
        ArrayList<User>list=new ArrayList<>();
        list.add(u1);
        list.add(u2);
        list.add(u3);
        oos.writeObject(list);
        oos.close();
    }

    private static void extracted1() throws IOException, ClassNotFoundException {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:\\test1.txt"));
        Object u;
        /*while((u=ois.readObject())!=null){
            System.out.println(u);
        }*/
        while(true) {
            try {
                User o = (User) ois.readObject();
                System.out.println(o);
            } catch (EOFException e) {
                break;
            }
        }
        ois.close();
    }

    private static void extracted() throws IOException {
        User u1=new User("sunbin","123");
        User u2=new User("sunbin1","123");
        User u3=new User("sunbin2","123");
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("C:\\test1.txt"));
        oos.writeObject(u1);
        oos.writeObject(u2);
        oos.writeObject(u3);
        oos.close();
    }
}
