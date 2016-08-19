package two.test.control;

import two.test.util.Sort;

/**
 * Created by Administrator on 2016/8/19.
 */
public class ExFour {
    public static void main(String[] args) {
        Sort sort=Sort.getInstance();
        int []order={50,55,67,25,34,68,11,32,54,43};
        sort.mergeSort(order,order.length);
        for (int i : order) {
            System.out.println(i);
        }

    }
}
