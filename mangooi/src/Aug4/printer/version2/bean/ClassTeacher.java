package Aug4.printer.version2.bean;

/**
 * Created by Administrator on 2016/8/4.
 */
public class ClassTeacher implements IInfo{
    private String name;
    private String hobby;

    public ClassTeacher(String name, String hobby) {
        this.name = name;
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return ""+name+"的个人爱好是"+hobby;
    }
}
