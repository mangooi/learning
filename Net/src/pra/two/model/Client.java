package pra.two.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by Administrator on 2016/8/20.
 */
public class Client {

    Socket socket;

    PrintWriter writer;

    BufferedReader reader;

    BufferedReader reader_receive;

    String info;

    public void start() throws IOException {
        try {
            socket=new Socket("127.0.0.1",2333);
            reader=new BufferedReader(new InputStreamReader(System.in));
            reader_receive=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            writer=new PrintWriter(socket.getOutputStream(),true);
            while (true){
                System.out.println("enter:");
                String string=reader.readLine();
                writer.println(string);
                /*while ((info = reader_receive.readLine()) != null)
                    System.out.println(info);*/
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            writer.close();
            reader.close();
            socket.close();
        }


    }
}
