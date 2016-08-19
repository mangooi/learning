package two.test.model;


/**
 * Created by Administrator on 2016/8/19.
 */
public class ExTwo {

    //将约瑟夫环建成一个链表
    public static int[] build(Node root, int n, int m) {
        Node current = root;
        for (int i = 2; i <= n; i++) {
            Node node = new Node(i);
            current.next = node;
            current = node;
        }
        current.next = root;
        int[] order = come(root, n, m);
        return order;
    }

    //出队列
    //结束条件：只有一个结点时，这个结点的next是它自身
    //将出来的数，放在一个数组中，遍历数组就是出队序列
    public static int[] come(Node root, int n, int m) {
        int[] order = new int[n];
        int j = 0;
        Node p = root;
        while (p.next != p) {
            int i = 1;
            while (i < m - 1) {
                p = p.next;
                i++;
            }
            if (i == m - 1) {
                order[j] = p.next.data;
                j++;
                p.next = p.next.next;
                p = p.next;
            }
        }
        order[j] = p.data;
        return order;
    }
}


