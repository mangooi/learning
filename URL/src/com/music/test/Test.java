package com.music.test;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URL;

/**
 * ?showapi_appid=myappid     &     topid=     &     showapi_sign=mysecret
 * Created by Administrator on 2016/8/19.
 */
public class Test {
    public static void main(String path[]) throws Exception {
        URL u=new URL("http://route.showapi.com/213-4?showapi_appid=23468&topid=3&showapi_sign=02a557b949684973a73e76f603c98680");
        InputStream in=u.openStream();
        ByteArrayOutputStream out=new ByteArrayOutputStream();
        try {
            byte buf[]=new byte[1024];
            int read = 0;
            while ((read = in.read(buf)) > 0) {
                out.write(buf, 0, read);
            }
        }  finally {
            if (in != null) {
                in.close();
            }
        }
        byte b[]=out.toByteArray( );
        System.out.println(new String(b,"utf-8"));
    }
}
