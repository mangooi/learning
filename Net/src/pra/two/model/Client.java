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
    private String host;
    public Client(String host){
        this.host=host;
    }

    private Socket socket;

    private PrintWriter writer;

    private BufferedReader reader;

    private BufferedReader reader_receive;

    String info="";

    public void start() throws IOException {
        try {
            socket=new Socket(host,2333);
            reader=new BufferedReader(new InputStreamReader(System.in));
            reader_receive=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            writer=new PrintWriter(socket.getOutputStream(),true);
            while (!info.equals("bye")){
                System.out.println("enter:");
                info =reader.readLine();
                writer.println(info);
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
