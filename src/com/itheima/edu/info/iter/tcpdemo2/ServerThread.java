package com.itheima.edu.info.iter.tcpdemo2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class ServerThread implements Runnable {
    private ServerSocket ss;

    public ServerThread(ServerSocket s) {
        this.ss = s;
    }

    @Override
    public void run() {
        File file = new File("C:\\Users\\Administrator\\Desktop\\itheima-edu-info-manager\\src\\com\\itheima\\edu\\info\\iter\\tcpdemo2\\test[" + UUID.randomUUID().toString() + "].txt");
        FileWriter fw = null;
        try {
            Socket s=ss.accept();
            fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            String len;
            BufferedWriter bw1 = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            BufferedReader bf = new BufferedReader(new InputStreamReader(s.getInputStream()));
            while ((len = bf.readLine()) != null) {
                System.out.println(len);
                bw.write(len);
                bw.newLine();
                bw.flush();
            }
            bw1.write("确认收到文件上传成功");
            bw1.newLine();
            bw1.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}