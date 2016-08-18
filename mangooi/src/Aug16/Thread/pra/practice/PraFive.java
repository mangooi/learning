package Aug16.Thread.pra.practice;

/**
 * alphabet
 * Created by Administrator on 2016/8/16.
 */
public class PraFive {
    public static void main(String[] args) {
        Object lock=new Object();
        Thread number=new Thread(){
            @Override
            public void run() {
                int number=1;
                while (number<=52){
                    synchronized (lock){
                        System.out.println(number++);
                        System.out.println(number++);
                        lock.notify();
                        try {
                            lock.wait();
                            System.out.println("------------");
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        };


        Thread alphabet=new Thread(){
            @Override
            public void run() {
                char alphabet='A';
                while (alphabet<='Z'){
                    synchronized (lock){
                        System.out.println((char)alphabet++);
                        lock.notify();
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        };
        number.start();
        alphabet.start();
    }
}
