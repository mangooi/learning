package pra.two.model;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务端
 * Created by Administrator on 2016/8/20.
 */
public class Server {
    //--ServerSocket
    private ServerSocket mServerSocket;
    //--Socket
    private Socket mSocket;
    //--Stream
    public void start() throws IOException {
        try {
            mServerSocket=new ServerSocket(2333);
            while (true){
                mSocket=mServerSocket.accept();
                ServerThread serverThread=new ServerThread(mSocket);
                serverThread.start();
                InetAddress address=mSocket.getInetAddress();
                System.out.println("已和"+address.getHostAddress()+"建立连接");

            }
            /*mSocket=mServerSocket.accept();
            br=new BufferedReader(new InputStreamReader(mSocket.getInputStream()));
            while (true){
                System.out.println(br.readLine());
            }*/
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            mServerSocket.close();
        }
    }
}
