package Aug4.printer.version1.test;
import Aug4.printer.version1.bean.*;

/**
 * Created by Administrator on 2016/8/4.
 */

public class Test {
    public static void main(String[] args) {
        Lesson lesson=new JavaLesson();
        Student student=new Student(lesson,"张三",100);
        School school=new School();
        Printer printer=new BlackPrinter();
        school.setPrinter(printer);
        printer.print(student);
        System.out.println(1);
    }
}
