package Aug7.homework.control;

import Aug7.homework.model.PracticeFour;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by mangooi on 2016/8/8.
 */
public class PracticeFourTest {
    public static void main(String[] args) {
        String[] array = new String[]{"1", "2","2" ,"3", "4"};
        Set set=new HashSet();
        set =PracticeFour.listAll(Arrays.asList(array), "",set);
        Iterator<String> iterator=set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
