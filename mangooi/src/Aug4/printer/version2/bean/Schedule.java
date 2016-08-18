package Aug4.printer.version2.bean;


/**
 * Created by Administrator on 2016/8/4.
 */
public class Schedule implements IInfo{
    private String time;
    private String lesson;


    public Schedule(String time, String lesson) {
        this.time = time;
        this.lesson = lesson;
    }

    @Override
    public String toString() {
        return lesson+"的上课时间为"+time;
    }
}
