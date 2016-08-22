package download.net.test;


import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * 测试获取文件大小1
 * http://www.sjtu.edu.cn/down.zip
 * http://cdn.duitang.com/uploads/item/201403/01/20140301142145_kt5Gc.jpeg
 * 416 ERROR
 * Created by Administrator on 2016/8/22.
 */
public class Test2 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://cdn.duitang.com/uploads/item/201403/01/20140301142145_kt5Gc.jpeg");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            //connection.setRequestProperty("User-Agent", "NetFox");
            connection.setRequestProperty("RANGE","bytes=0");
            connection.getResponseCode();//返回值可用做连接成功与否判断
            /*String sHeader;
            long length=0;
            for (int i = 1; ; i++) {
                //DataInputStream in = new DataInputStream(httpConnection.getInputStream ());
                //Utility.log(in.readLine());
                sHeader = connection.getHeaderFieldKey(i);
                if (sHeader != null) {
                    if (sHeader.equals("Content-Length")) {
                        length = Integer.parseInt(connection.getHeaderField(sHeader));
                        break;//这个出口获得准确的文件大小
                    }
                } else
                    break;//这个出口返回值为0..
            }
            System.out.println("文件大小:"+length);*/

            //下载文件断点测试

            InputStream in=connection.getInputStream();
            RandomAccessFile file=new RandomAccessFile("2.png","rw");
            long Pos=0;
            file.seek(Pos);
            byte[] bytes=new byte[1024];
            int read_length;
            while ((read_length=in.read(bytes,0,1024))>0){
                file.write(bytes,0,read_length);
            }
            /*in.read(bytes,0,500);
            file.write(bytes,0,500);*/

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
