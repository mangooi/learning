package pra.two.test;

import pra.two.model.Server;

import java.io.IOException;

/**
 * Created by Administrator on 2016/8/21.
 */
public class TServer {
    public static void main(String[] args) {
        try {
            new Server().start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
