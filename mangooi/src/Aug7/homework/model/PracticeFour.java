package Aug7.homework.model;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Created by mangooi on 2016/8/8.
 */
public class PracticeFour {
    public static Set listAll(List candidate, String prefix, Set set) {
        if (candidate.isEmpty()) {
            set.add(prefix);
        }
        for (int i = 0; i < candidate.size(); i++) {
            List temp = new LinkedList(candidate);
            listAll(temp, prefix + temp.remove(i),set);
        }
        return set;
    }
}
