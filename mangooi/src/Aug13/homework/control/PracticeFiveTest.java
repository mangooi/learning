package Aug13.homework.control;

import Aug13.homework.model.PracticeFive;

import java.util.Map;
import java.util.Set;

/**
 * Created by Administrator on 2016/8/13.
 */
public class PracticeFiveTest {
    public static void main(String[] args) {
        Set<Map.Entry<Integer,Integer>> set=PracticeFive.count(PracticeFive.createIntArray()).entrySet();
        for (Map.Entry entry:set){
            System.out.println(entry);
        }
    }
}
