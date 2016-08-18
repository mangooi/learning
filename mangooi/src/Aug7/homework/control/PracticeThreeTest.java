package Aug7.homework.control;

import Aug7.homework.model.PracticeThree;

import java.util.List;

/**
 * Created by mangooi on 2016/8/8.
 */
public class PracticeThreeTest {
    public static void main(String[] args) {
        List list= PracticeThree.count("aavzcadfdsfsdhshgWasdfasdfdddaaa");
        System.out.println("出现最多的次数为:"+list.get(0)+"次\n字母为:");
        for (int i=1;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
