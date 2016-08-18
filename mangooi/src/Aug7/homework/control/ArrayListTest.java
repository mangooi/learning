package Aug7.homework.control;

import Aug7.homework.model.ArrayList;

/**
 * Created by mangooi on 2016/8/8.
 */
public class ArrayListTest {
    public static void main(String[] args) {
        //ArrayList arrayList=new ArrayList();
        for (int i=1;i<=18;i++) {
            ArrayList.add(i);
            ArrayList.find(i-1);
        }
        ArrayList.remove(5);
        ArrayList.find(5);
        ArrayList.revise(5,500);
        ArrayList.find(5);

    }
}





