package download.net.control;

import download.net.model.FileInfo;

/**
 * 断点下载测试类11
 * http://i0.hdslb.com/group1/M00/B7/9A/oYYBAFd16ASAFbS4AAcNql6NOb8768.png
 * Created by Administrator on 2016/8/22.
 */
public class Test {
    public Test(){
        FileInfo fileInfo=new FileInfo("http://i0.hdslb.com/group1/M00/B7/9A/oYYBAFd16ASAFbS4AAcNql6NOb8768.png", "F:\\temp","4.png",10);
        FileFetch fileFetch=new FileFetch(fileInfo);
        fileFetch.start();
    }
    public static void main(String[] args) {
        new Test();
    }
}
