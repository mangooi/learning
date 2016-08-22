package download.net.model;

import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * 从网站上下载部分文件的模块
 * Created by Administrator on 2016/8/22.
 */
public class FileDownload extends Thread{
    private String mFileURL;
    private String mFilePath;
    private long mStartPos;
    private long mEndPos;
    private int threadID;
    private RandomAccessFile mFile;

    public FileDownload(String mFileURL,String mFilePath ,long mStartPos, long mEndPos, int threadID) {
        this.mFileURL = mFileURL;
        this.mFilePath=mFilePath;
        this.mStartPos = mStartPos;
        this.mEndPos = mEndPos;
        this.threadID = threadID;
    }

    @Override
    public void run() {
        super.run();
        try {
            URL url=new URL(mFileURL);
            HttpURLConnection connection= (HttpURLConnection) url.openConnection();
            String temp="bytes="+String.valueOf(mStartPos)+"-";
            connection.setRequestProperty("RANGE",temp);
            System.out.println(temp);
            InputStream in=connection.getInputStream();
            byte[] bytes=new byte[1024];
            int length;
            mFile=new RandomAccessFile(mFilePath,"rw");
            mFile.seek(mStartPos);
            while ((length=in.read(bytes,0,1024))>0&&mStartPos<mEndPos){
                mStartPos+=write(bytes,0,length);
            }
            System.out.println("线程"+threadID+"已下载结束");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private synchronized long write(byte[] bytes,int start,int length) {
        try {
            mFile.write(bytes,start,length);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return length;
    }
}
