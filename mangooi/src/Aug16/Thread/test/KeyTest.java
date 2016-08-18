package Aug16.Thread.test;

/**
 * 同时允许执行的线程数量测试
 * Created by Administrator on 2016/8/16.
 */
public class KeyTest {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.setName("1");
        MyThread t2 = new MyThread();
        t2.setName("2");
        MyThread t3 = new MyThread();
        t3.setName("3");
        MyThread t4 = new MyThread();
        t4.setName("4");
        MyThread t5 = new MyThread();
        t5.setName("5");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
class MyThread extends Thread {
    static int count = 0;
    @Override
    public void run() {
        while (true) {
            synchronized (selectKey()) {
                System.out.println(getName());
                System.out.println("-------------");
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    private String selectKey() {
        if (++count % 2 == 0) {
            return "1435435243";
        } else {
            return "24535435A32";
        }
    }
}