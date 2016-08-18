package Aug16.Thread.pra.practice;

import java.util.Calendar;
import java.util.Locale;

/**
 * Created by Administrator on 2016/8/16.
 */
public class PraTwo {
    public static void main(String[] args) {
        //每隔10秒打印一次系统时间
        new Thread(){
            @Override
            public void run() {
                while (true){
                    Calendar calendar=Calendar.getInstance(Locale.CHINESE);
                    System.out.println(calendar.getTime());
                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
        //打印能被4整出的数字
        new Thread(){
            @Override
            public void run() {
                for (int number=1;;number++){
                    if (number%4==0){
                        System.out.println(number);
                    }
                    try {
                        /*Thread.*/sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
    }
}
