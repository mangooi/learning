package Aug4.printer.version2.test;

import Aug4.printer.version2.bean.BlackPrinter;
import Aug4.printer.version2.bean.IInfo;
import Aug4.printer.version2.bean.IPrinter;
import Aug4.printer.version2.bean.Student;

/**
 * Created by Administrator on 2016/8/4.
 */
public class Test {
    public static void main(String[] args) {
        IPrinter printer1=new BlackPrinter();
        IInfo student=new Student(20,"张三");
        printer1.print(student);

    }
}
