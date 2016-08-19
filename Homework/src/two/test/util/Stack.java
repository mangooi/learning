package two.test.util;

import java.util.LinkedList;

/**
 * Created by Administrator on 2016/8/19.
 */
public class Stack<T> {
    private LinkedList<T> stackList=new LinkedList<>();
    private static Stack stack=new Stack();

    private Stack() {
    }
    public static Stack getInstance(){
        return stack;
    }

    /**
     * 压栈
     * @param e 要进栈的元素
     * @return true : 如果压栈成功 否则返回false
     */
    public boolean push(T e){
        if (e==null){
            return false;
        }else {
            stackList.addFirst(e);
        }
        return true;
    }

    /**
     * 出栈
     * @return 出栈的元素
     */
    public T pop(){
        return stackList.removeFirst();
    }

    public int size(){
        return stackList.size();
    }

}
