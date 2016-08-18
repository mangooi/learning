package Aug16.Thread.pra.practice;

/**
 * Created by Administrator on 2016/8/16.
 */
public class PraThree {
    public static void main(String[] args) {
        Thread train1 = new Train("火车1");
        Thread train2 = new Train("火车2");
        Thread train3 = new Train("火车3");
        Thread train4 = new Train("火车4");
        Thread train5 = new Train("火车5");
        train1.start();
        train2.start();
        train3.start();
        train4.start();
        train5.start();
    }
}

class Train extends Thread {

    public Train(String name) {
        super(name);
    }

    @Override
    public void run() {
        synchronized ("") {
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            passhole();
        }
    }

    private void passhole() {
        System.out.println(getName() + "通过山洞");
    }
}
