package Aug16.Thread.pra.practice;

/**
 * Created by Administrator on 2016/8/16.
 */
public class PraOne {
    public static void main(String[] args) {


        new Thread(){
            @Override
            public void run() {
                while(true){
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("AAA");
                }
            }
        }.start();



        new Thread(){
            @Override
            public void run() {
                while(true){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("B");
                }
            }
        }.start();
    }
}
