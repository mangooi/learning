package Aug7.homework.model;
import java.util.*;

/**
 * Created by mangooi on 2016/8/8.
 */
public class PracticeThree {
    public static List count(String msg){
        List list=new LinkedList();
        int count_max=0;
        for (char i='a';i<='z';i++){
            int count=CountTimes.countTimes(msg,String.valueOf(i));
            if (count>count_max){
                count_max=count;
            }
        }
        list.add(count_max);
        for (char i='a';i<='z';i++){
            int count=CountTimes.countTimes(msg,String.valueOf(i));
            if (count==count_max){
                //map.put(String.valueOf(i),count);
                list.add(i);
            }
        }
        return list;
    }
}
