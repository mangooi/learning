package Aug4.printer.version2.bean;

/**
 * Created by Administrator on 2016/8/4.
 */
public class Student implements IInfo{
    private int age;
    private String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString(){
        return name+"的年龄:"+age;
    }
}
