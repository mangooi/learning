package Aug7.homework.model;

/**
 * Created by mangooi on 2016/8/7.
 */
public class PracticeOne {
    /**
     * 判断1个数是不是2的N次方
     * @param number 需要判断的数
     * @return -1 输入的不是正整数; 1 输入的数是2的N次方; 0 输入的数不是2的N次方
     */
    public static int judge (int number){
        if (number<=0)
            return -1;
        for (int a=2;a<=number;a*=2){
            if (a==number){
                return 1;
            }
        }
        return 0;
    }
}
