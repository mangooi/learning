package Aug4.printer.version2.bean;

/**
 * Created by Administrator on 2016/8/4.
 */
public class School {
    private String name;
    private String address;

    public School(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return name+"学校的地址为"+address;
    }
}
