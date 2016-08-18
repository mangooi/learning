package Aug7.homework.control;

import Aug7.homework.model.PracticeOne;

import java.util.Scanner;

/**
 * Created by mangooi on 2016/8/7.
 */
public class PracticeOneTest {
    public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            System.out.println("请输入一个正整数");
            int number=scan.nextInt();
            int result=PracticeOne.judge(number);
            switch (result){
                case 1:
                    System.out.println("是!");
                    break;
                case 0:
                    System.out.println("不是!");
                    break;
            case -1:
                System.out.println("麻烦你输入个正整数好么");
                break;
            default:
                break;
        }
    }
}
