package Aug9.pra;


import Aug4.printer.version1.bean.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeMap;

/**
 * Created by Administrator on 2016/8/9.
 */
public class CollectionTest{
    public static void main(String[] args) {
        ArrayList<Student> arrayList=new ArrayList<>();
        arrayList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return 0;
            }



        });
    }
}
