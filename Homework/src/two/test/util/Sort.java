package two.test.util;

/**
 * Created by Administrator on 2016/8/19.
 */
public class Sort {
    private static final Sort sort=new Sort();
    private Sort(){
    }
    public static Sort getInstance(){
        return sort;
    }

    public void mergeSort(int[] order ,int n){
        int[] temp = new int[n];
        merge_sort(order, 0, n - 1, temp);
    }

    private void merge_sort(int[] order, int first, int last, int[] temp) {
        if (first < last)
        {
            int mid = (first + last) / 2;
            merge_sort(order, first, mid, temp);
            merge_sort(order, mid + 1, last, temp);
            merge(order, first, mid, last, temp);
        }

    }

    private void merge(int[] order, int first, int mid, int last, int[] temp) {
        int i = first;
        int j = mid + 1;
        int m = mid;
        int n = last;
        int k = 0;
        while (i <= m && j <= n)
        {
            if (order[i] <= order[j])
                temp[k++] = order[i++];
            else
                temp[k++] = order[j++];
        }

        while (i <= m)
            temp[k++] = order[i++];

        while (j <= n)
            temp[k++] = order[j++];

        for (i = 0; i < k; i++)
            order[first + i] = temp[i];
    }

}
