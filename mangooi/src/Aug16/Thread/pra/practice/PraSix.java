package Aug16.Thread.pra.practice;

/**
 * 生产者 producer
 * Created by Administrator on 2016/8/16.
 */
public class PraSix {
    public static void main(String[] args) {
        Apple apple=new Apple();
        Basket producer=new Basket("生产者",apple){
            @Override
            public void run() {
                for (int i=0;i<4;i++){
                    synchronized (""){
                        try {
                            sleep(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        apple.number++;
                        System.out.println("生产者已经生产1个苹果,剩余:"+apple.number);

                        "".notify();
                        try {
                            "".wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        };
        Basket customer=new Basket("消费者",apple){
            @Override
            public void run() {
                for (int i=0;i<4;i++){
                    synchronized (""){
                        try {
                            sleep(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        apple.number--;
                        System.out.println("消费者已经吃掉1个苹果,剩余:"+apple.number);

                        "".notify();
                        try {
                            "".wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        };
        producer.start();
        customer.start();
    }
}
class Basket extends Thread{
    private Apple mApple;
    public Basket(String name,Apple apple) {
        super(name);
        mApple=apple;
    }
}

class Apple{
    public int number=0;
}
