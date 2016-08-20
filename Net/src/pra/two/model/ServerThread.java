package pra.two.model;

import java.io.*;
import java.net.Socket;

/**
 * Created by Administrator on 2016/8/20.
 */
public class ServerThread extends Thread{

    private BufferedReader reader;

    private PrintWriter writer;

    private String info;

    private Socket mSocket=null;
    public ServerThread(Socket socket){
        mSocket=socket;
    }

    @Override
    public void run() {
        super.run();
        try {
            reader=new BufferedReader(new InputStreamReader(mSocket.getInputStream()));
            writer=new PrintWriter(new OutputStreamWriter(mSocket.getOutputStream()));
            while ((info = reader.readLine()) != null){
                System.out.println(info);
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
