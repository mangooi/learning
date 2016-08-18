package Aug18.exception;


import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * InputMismatchException
 * Created by Administrator on 2016/8/18.
 */
public class Login {
    public static void main(String[] args) {
        new Util();
    }
}
class Util{
    private Scanner mScanner;
    private File file;
    private OutputStream out;
    Util(){
        mScanner=new Scanner(System.in);
        login();
    }
    private void login(){
        System.out.println("请输入数字");
        try {
            mScanner.nextInt();
        }catch (InputMismatchException e){
            writeToLog(e);
//            System.out.println("输入异常");
//            e.printStackTrace();
        }finally {
            mScanner.close();
        }
    }
    private boolean writeToLog(InputMismatchException e){
        String str=e.toString();
        file=new File("Log/log.txt");
        checkFile(file);
        try {
            out=new FileOutputStream(file,true);
            out.write(str.getBytes());
            out.write("\r\n".getBytes());
            out.close();
        } catch (FileNotFoundException a) {
            a.printStackTrace();
        }catch (Exception b){
            b.printStackTrace();
        }
        return true;
    }

    /**
     * 检查是否存在文件,不存在则创建
     * @param file 文件
     */
    private void checkFile(File file) {
        if (!file.exists()){
            try {
                String path = file.getAbsolutePath();//--获取绝对路径
                String parentPath = path.substring(0,path.lastIndexOf(File.separator));
                File parentFile = new File(parentPath);
                parentFile.mkdirs();//--使用该方法确保多级路径不存在时都可以被创建出来
                //--区别mkdir. 只能创建一级路径
                file.createNewFile();//--创建文件
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}


