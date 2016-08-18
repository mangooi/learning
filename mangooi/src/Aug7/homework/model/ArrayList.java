package Aug7.homework.model;

import java.util.Arrays;

/**
 * Created by mangooi on 2016/8/8.
 */
public class ArrayList{
    //记录ArrayList成员数量
    private static int index=0;
    private static Object[] objects=new Object[16];

    /**
     * 增加一个元素
     * @param object 增加的元素
     */
    public static void add(Object object){
        objects[index]=object;
        index++;
        expansion(objects);
    }

    /**
     * 增加一个元素放在指定位置
     * @param add_index 位置
     * @param object 增加的元素
     */
    public static void add(int add_index,Object object){
        for (int i=add_index;i<index;i++){
            objects[i+1]=objects[i];
        }
        objects[add_index]=object;
        index++;
        expansion(objects);
    }

    /**
     * 删除一个元素
     * @param del_index 要删除的元素的位置
     */
    public static void remove(int del_index){
        for (int i=del_index;i<index;i++){
            objects[i]=objects[i+1];
        }
        index--;
    }

    /**
     * 修改一个元素
     * @param re_index 要修改的元素的位置
     * @param object 要修改的值
     */
    public static void revise(int re_index,Object object){
        objects[re_index]=object;
    }

    /**
     * 查找元素并输出
     * @param find_index 查找的元素的位置
     */
    public static void find(int find_index){
        System.out.println(objects[find_index].toString());
    }

    /**
     * 查询已有元素个数
     * @return 个数
     */
    public static int length(){
        return index;
    }

    /**
     * 扩容
     * @param objects_judge 判断是否需要扩容
     */
    private static void expansion(Object [] objects_judge){
        if (objects_judge[objects_judge.length-1]!=null){
            objects=Arrays.copyOf(objects_judge,objects_judge.length+16);
        }
    }
}
