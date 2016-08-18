package Aug16.Thread.pra;


import java.util.Random;

/**
 * Created by Administrator on 2016/8/16.
 */
public class Test3 extends Thread{
    public static void main(String[] args) {
        thread t1=new thread();
        t1.setName("猴子1");
        t1.start();

        thread t2=new thread();
        t2.setName("猴子2");
        t2.start();

        thread t3=new thread();
        t3.setName("猴子3");
        t3.start();
    }
}
class thread extends Thread{
    static int tao=100;
    static String key="";
    @Override
    public void run() {
        while(true){
            synchronized (select()) {
                if(tao>1){
                    if(tao%2==0){
                        System.out.print(tao+"个桃子中");
                        tao=tao/2;
                        System.out.println(Thread.currentThread().getName()+"抢了"+tao+"个桃还剩"+tao+"个");
                    }else{
                        System.out.print(tao+"个桃子中");
                        tao=(tao-1)/2;
                        System.out.print(Thread.currentThread().getName()+"抢了"+tao+"个桃");
                        tao=tao+1;
                        System.out.println("还剩"+tao+"个");
                    }
                }else{
                    break;
                }
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    private String select() {
        Random random=new Random();
        return String.valueOf(random.nextInt(1));
    }
}

