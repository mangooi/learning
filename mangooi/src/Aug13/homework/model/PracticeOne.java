package Aug13.homework.model;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Administrator on 2016/8/13.
 */
public class PracticeOne<E> {
    Set<E> set;
    public PracticeOne(){
        set=new TreeSet<>();
    }
    public  ArrayList<E> removeRepeat(ArrayList<E> arrayList){
        /*for(E e:arrayList){
            set.add(e);
        }*/
        set.addAll(arrayList);
        arrayList.clear();
        arrayList.addAll(set);
        return arrayList;
    }

}
