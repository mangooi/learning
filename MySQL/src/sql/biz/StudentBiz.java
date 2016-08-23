package sql.biz;

import sql.model.Student;

import java.util.List;

/**
 * Created by Administrator on 2016/8/23.
 */
public interface StudentBiz {
    public List<Student> getAllStudent();

    public Student getStudentById(int id);

    public boolean addStudent(Student student);

    public boolean addStudent(List<Student> list);
}
