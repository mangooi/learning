package com.example.demo;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 *     <img style="-webkit-user-select: none" src="http://e.hiphotos.baidu.com/image/h%3D200/sign=31e61d6532f33a87816d071af65d1018/95eef01f3a292df504213240b4315c6035a87381.jpg">
 * <img width="270" height="129" hidefocus="true" src="//www.baidu.com/img/bd_logo1.png">
 * Created by Jun on 2016/8/20 0020.
 */
public class Test {
    public static void main(String[] args) {
        //--1.构建一个URL对象
        //-- url urn uri 三者的区别
        try {
            URL url = new URL("http://img2.3lian.com/2014/f6/173/d/51.jpg");
            HttpURLConnection conn1 = (HttpURLConnection) url.openConnection();
            conn1.setConnectTimeout(5000);//--连接超时时间
            conn1.setRequestMethod("POST");//--以get进行请求还可以是post
            conn1.getResponseCode();//--获取返回码 .200 连接成功 404 400 505
            //--2.通过URL对象打开流
            InputStream is = url.openStream();
            //--3.创建一个文件
            File file = new File("F:" + File.separator + "17.gif");
            file.createNewFile();
            //--4.向文件中写入内容.图片媒体等要以字节流的形式进行读写
            OutputStream os = new FileOutputStream(file);
            //--5.设置缓冲区
            byte[] bytes = new byte[1024];
            StringBuilder sb = new StringBuilder();
            int length = 0;
            while (-1 != (length = is.read(bytes))){
                os.write(bytes,0,length);
                os.flush();
            }
            os.close();
            is.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
