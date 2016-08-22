package com.example.demo;

import java.io.*;
import java.net.Socket;
import java.util.logging.Logger;

/**
 *
 * 1.网络(URL)  + 文件(RandomAccess) + 线程  ->  断点下载
 * 2.网络(Socket)+ 线程 ->多客户端通信
 * Created by Jun on 2016/8/20 0020.
 */
public class ClientDemo {

    public static void main(String[] args) {

        //--1.构建Socket
        Socket socket = null;
        //--提供流对象
        BufferedReader br = null;
        PrintWriter pw = null;

        try {
            //--当Socket对象建立成功时已经与服务端建立好连接
            socket = new Socket("127.0.0.1", ServerDemo.PORT);
            //--用来接收服务端的消息
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            //--发送消息到服务端
            pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
            //--用于从控制台获取的 System.in 系统的输入流
            BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
                System.out.println("Enter Something Send To Server");
                String str = br2.readLine();//--.从控制台读取内容
                System.out.println(str);
                //--发送给服务端
                pw.println(str);
                pw.flush();
                //--接收
                String temp = br.readLine();
               /* if (temp.equals("Bye")) {
                    pw.println("Bye");
                    pw.flush();
                    break;
                }*/
                Logger.getGlobal().info("Server Send Message:\t" + temp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
                pw.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
