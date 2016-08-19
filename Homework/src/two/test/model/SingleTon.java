package two.test.model;

/**
 * 懒汉式单例
 * Created by Administrator on 2016/8/19.
 */
public class SingleTon {
    private static final SingleTon singleTon=new SingleTon();
    private SingleTon(){

    }

    public SingleTon getSingleTon(){
        return singleTon;
    }
}
