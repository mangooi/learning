package Aug13.stack.model;

/**
 * Created by Administrator on 2016/8/13.
 */
public interface IStack<E> {
    void push(E state);
    E pop();
    int size();
    boolean find(E state);
}
