package pra.two.test;

import pra.two.model.Client;

import java.io.IOException;

/**
 * Created by Administrator on 2016/8/21.
 */
public class Client1 {
    public static void main(String[] args) {
        try {
            new Client("127.0.0.1").start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
