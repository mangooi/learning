package Aug4.Demo1.test;

import Aug4.Demo1.bean.Dog;
import Aug4.Demo1.bean.Feeder;
import Aug4.Demo1.bean.Master;
import Aug4.Demo1.bean.Person;

/**
 * Created by Administrator on 2016/8/4.
 */
public class Test {
    public static void main(String[] args) {
        Person person1=new Master();
        Person person2=new Feeder();
        Dog dog1=new Dog("Monkey","Red","hhhh");
        person1.walk(dog1);
        person2.walk(dog1);
    }
}
