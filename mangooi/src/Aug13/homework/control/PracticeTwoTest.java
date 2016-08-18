package Aug13.homework.control;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Administrator on 2016/8/13.
 */
public class PracticeTwoTest {
    public static void main(String[] args) {
        Set<String> set=new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                /*if (o1.length()==o2.length()){
                    return 1;
                }else */
                if (o1.length()>o2.length()){
                    return 1;
                }else {
                    return -1;
                }
            }
        });
        set.add("xiaoqiang");
        set.add("zhangsan");
        set.add("lisi");
        set.add("xiaohua");
        set.add("ruhua");
        set.add("wangcai");
        for (String string:set){
            System.out.println(string);
        }
    }
}
