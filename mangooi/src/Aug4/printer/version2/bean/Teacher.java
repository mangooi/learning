package Aug4.printer.version2.bean;

/**
 * Created by Administrator on 2016/8/4.
 */
public class Teacher implements IInfo{
    private String name;
    private int salary;

    public Teacher(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name+"的薪资是"+salary;
    }
}
