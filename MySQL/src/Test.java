import sql.biz.StudentBiz;
import sql.bizImpl.StudentBizImpl;
import sql.model.Student;

import java.util.List;

/**
 * Created by Administrator on 2016/8/23.
 */
public class Test {
    public static void main(String[] args) {
        StudentBiz studentBiz=new StudentBizImpl();
        System.out.println(studentBiz.getStudentById(3));
        studentBiz.addStudent(new Student("ex",19,"130000"));
        List<Student> list=studentBiz.getAllStudent();
        list.forEach(System.out::println);
    }
}
