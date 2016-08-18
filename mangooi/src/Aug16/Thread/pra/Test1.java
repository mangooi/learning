package Aug16.Thread.pra;


/**
 * Created by Administrator on 2016/8/16.
 */
public class Test1 {
    public static void main(String[] args) {
        Peach peach=new Peach();
        Thread t1=new Thread(){
            @Override
            public void run() {
                while (peach.getNumber()!=1){
                int number=peach.getNumber();
                int number_get=number/2;
                number=number-number_get;
                peach.setNumber(number);
                System.out.println("猴子A抢到了"+number_get+"个桃子");}
            }
        };
        Thread t2=new Thread(){
            @Override
            public void run() {
                while (peach.getNumber()!=1) {
                    int number = peach.getNumber();
                    int number_get = number / 2;
                    number = number - number_get;
                    peach.setNumber(number);
                    System.out.println("猴子B抢到了" + number_get + "个桃子");
                }
            }
        };
        Thread t3=new Thread(){
            @Override
            public void run() {
                while (peach.getNumber()!=1){
                int number=peach.getNumber();
                int number_get=number/2;
                number=number-number_get;
                peach.setNumber(number);
                System.out.println("猴子C抢到了"+number_get+"个桃子");}
            }
        };
        t1.start();
        t2.start();
        t3.start();
    }
}
class Monkey{
    ;
}
