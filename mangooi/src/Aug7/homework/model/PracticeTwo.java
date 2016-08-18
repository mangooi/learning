package Aug7.homework.model;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by mangooi on 2016/8/8.
 */
public class PracticeTwo {
    public static void listAll(List candidate, String prefix) {
        if (!prefix.equalsIgnoreCase(""))
            System.out.println(prefix);
        for (int i = 0; i < candidate.size(); i++) {
            List temp = new LinkedList(candidate);
            listAll(temp, prefix + temp.remove(i));
        }
    }
}
