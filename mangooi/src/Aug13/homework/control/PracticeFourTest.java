package Aug13.homework.control;

import Aug7.homework.model.CountTimes;

/**
 * Created by Administrator on 2016/8/13.
 */
public class PracticeFourTest {
    public static void main(String[] args) {
        int count;
        String string="asdascveasrgdfsdf";
        for (char i='a';i<='z';i++){
            count=CountTimes.countTimes(string,String.valueOf(i));
            if (count==0)continue;
            System.out.print(i+"("+count+") ");
        }
    }
}
