package Aug7.homework.control;

import Aug7.homework.model.LinkList;

/**
 * Created by mangooi on 2016/8/8.
 */
public class LinkListTest {
    public static void main(String[] args) {
            LinkList linkList=new LinkList();
            linkList.insertFirst(1);
            //linkList.deleteFirst();
            linkList.find(2);
            linkList.revise(1,5);
            linkList.find(5);
        }
    }
