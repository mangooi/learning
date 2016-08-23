package pra.two.model;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * Created by Administrator on 2016/8/20.
 */
public class ServerThread extends Thread{

    private BufferedReader reader;

    private PrintWriter writer;

    private String info;

    private String address;

    private Socket mSocket=null;
    public ServerThread(Socket socket){
        mSocket=socket;
    }

    @Override
    public void run() {
        super.run();
        try {
            address=mSocket.getInetAddress().getHostAddress();
            reader=new BufferedReader(new InputStreamReader(mSocket.getInputStream()));
            writer=new PrintWriter(new OutputStreamWriter(mSocket.getOutputStream()));
            while (true){
                info= reader.readLine();
                if (info==null || info.equals("Bye")){
                    writer.println("Bye!");
                    System.out.println("断开连接");
                    break;
                }
                System.out.println(info);
                if (info.equals("bye")){
                    System.out.println("已和"+address+"断开连接");
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                writer.close();
                reader.close();
                mSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
