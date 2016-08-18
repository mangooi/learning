package Aug13.homework.control;

import Aug13.homework.model.PracticeOne;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/8/13.
 */
public class PracticeOneTest {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("张三");
        arrayList.add("李四");
        arrayList.add("王五");
        arrayList.add("张三");
        arrayList.add("aaa");
        arrayList.add("aaa");
        arrayList.add("bbb");
        PracticeOne<String> method=new PracticeOne<>();
        arrayList=method.removeRepeat(arrayList);
        for (String string:arrayList){
            System.out.println(string);
        }
    }
}
