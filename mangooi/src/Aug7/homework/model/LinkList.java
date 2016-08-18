package Aug7.homework.model;


/**
 * Created by mangooi on 2016/8/8.
 */
public class LinkList {
    private Node first;
    public LinkList(){
        this.first=null;
    }
    public void insertFirst(Object datax){
        Node data = new Node(datax);
        data.next = first;
        first = data;
    }
    public void deleteFirst(){
        if(first == null){
            System.out.println("没元素你删个球啊!");
            return;
        }
        //Node temp = first;
        first = first.next;
    }
    public Node find(Object number){
        if (first==null){
            System.out.println("没元素你查什么查!");
            return null;
        }
        Node node=first;
        while (node!=null){
            if (node.data.equals(number)){
                System.out.println("找到数据");
                return node;
            }
            node=node.next;
        }
        System.out.println("木有啊!");
        return null;
    }

    public void revise(Object number,Object data){
        Node receive=find(number);
        if (receive==null){
            System.out.println("找不到该数据");
            return;
        }else {
            receive.data=data;
            System.out.println("已经修改成"+data);
        }
    }


}
