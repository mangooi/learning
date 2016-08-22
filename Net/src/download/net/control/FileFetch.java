package download.net.control;

import download.net.model.FileDownload;
import download.net.model.FileInfo;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * 1.获取文件长度
 * 2.分割文件
 * 3.创建子线程-----启动子线程
 * 4.下载完成
 *
 * Created by Administrator on 2016/8/22.
 */
public class FileFetch extends Thread{
    FileInfo mFileInfo=null;//文件信息
    long startPos[];//开始位置
    long endPos[];//结束位置
    long mFileSize;
    FileDownload fileDownloads[];//子线程


    public FileFetch(FileInfo mFileInfo){
        this.mFileInfo=mFileInfo;
        startPos=new long[mFileInfo.getmSplitter()];
        endPos=new long[mFileInfo.getmSplitter()];
    }

    @Override
    public void run() {
        super.run();
        mFileSize=getFileSize();
        //--分割
        for (int i=0;i<startPos.length;i++){
            startPos[i]=i*(mFileSize/startPos.length);
        }
        System.arraycopy(startPos, 1, endPos, 0, endPos.length - 1);
        endPos[endPos.length-1]=mFileSize;
        //--创建子线程
        fileDownloads=new FileDownload[mFileInfo.getmSplitter()];
        //--启动
        for (int i=0;i<mFileInfo.getmSplitter();i++){
            fileDownloads[i]=new FileDownload(mFileInfo.getmSiteURL(),
                    mFileInfo.getmFilePath()+ File.separator+mFileInfo.getmFileName(),startPos[i],endPos[i],i+1);
            System.out.println("线程"+(i+1)+"已启动");
            fileDownloads[i].start();
        }

    }

    /**
     * 获取文件长度:
     *      1.创建连接
     *      2.获取头关键字进行判断("Content-Length")
     *      3.取出相应的值并返回
     * @return 文件长度
     */
    private long getFileSize() {
        try {
            long fileLength;
            URL url=new URL(mFileInfo.getmSiteURL());
            HttpURLConnection connection= (HttpURLConnection) url.openConnection();
            //connection.setRequestProperty("User-Agent","NetFox");
            String header;
            for (int i=1;;i++){
                header=connection.getHeaderFieldKey(i);
                if (header.equals("Content-Length")){
                    fileLength=Integer.parseInt(connection.getHeaderField(header));
                    break;
                }
            }


            return fileLength;





        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return 0;
    }
}
