package Aug4.Demo1.bean;


/**
 * Created by Administrator on 2016/8/4.
 */
public class Master extends Person{
    @Override
    public void walk(Dog dog) {
        if (dog==null)
            return;
        System.out.println("Master遛"+dog);
    }
}
