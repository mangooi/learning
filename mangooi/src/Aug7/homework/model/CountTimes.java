package Aug7.homework.model;

/**
 * Created by mangooi on 2016/8/4.
 */
public class CountTimes {
    public static int countTimes(String msg,String target){
        int count=0;
        int index=0;
        while (index<msg.length()) {
            index=msg.indexOf(target,index);
            if (index==-1)
                break;
            index=index+target.length();
            count++;
        }
        return count;
    }
}
