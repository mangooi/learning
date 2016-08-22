package download.net.test;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**1
 * Created by Administrator on 2016/8/21.
 */
public class Test {
    public static void main(String[] args) {
        try {
            URL url=new URL("http://i0.hdslb.com/group1/M00/B7/9A/oYYBAFd16ASAFbS4AAcNql6NOb8768.png");
            HttpURLConnection connection= (HttpURLConnection) url.openConnection();
            connection.setConnectTimeout(5000);
            connection.setRequestMethod("GET");
            connection.getResponseCode();//返回码  200  正常   断点下载204

            InputStream in=url.openStream();

            File file=new File("1.png");
            file.createNewFile();

            OutputStream out=new FileOutputStream(file);

            byte[] bytes=new byte[1024];
            int length;
            while (true) {
                length = in.read(bytes);
                if (length<=0)
                    break;
                out.write(bytes, 0, length);
                out.flush();
            }
            out.close();
            in.close();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
