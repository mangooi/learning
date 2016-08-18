package Aug13.stack.model;


import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * Created by Administrator on 2016/8/13.
 */
public class Stack<E> extends AbstractStack<E>{
    private LinkedList<E> mStackList;
    private static int size=0;

    public Stack(){
        mStackList=new LinkedList<>();
    }
    /**
     * Element
     * @param state
     */
    @Override
    public void push(E state) {
        mStackList.addLast(state);
        size++;
    }

    /**
     *
     * @return
     */
    @Override
    public E pop() {
        if (mStackList.getLast()==null)
            throw new NoSuchElementException();
        E state=mStackList.removeLast();
        size--;
        return state;
    }

    /**
     *
     * @return
     */
    @Override
    public int size() {
        return size;
    }

    /**
     *
     * @param state
     * @return
     */
    @Override
    public boolean find(E state) {
        for (E t:mStackList){
            if (t==state)return true;
        }
        return false;
    }
}

