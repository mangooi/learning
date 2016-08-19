package two.test.control;

import two.test.model.ExTwo;
import two.test.model.Node;

/**
 * Created by Administrator on 2016/8/19.
 */
public class ExTwoTest {
    public static void main(String[] args) {
        //头结点
        Node root = new Node(1);
        int[] order = ExTwo.build(root, 30, 9);
        for (int i = 0; i < order.length; i++) {
            System.out.print(order[i] + " ");
        }
    }
}
