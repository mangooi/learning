package sql.model.dao;

import sql.model.Student;

import java.util.List;

/**
 * Created by Administrator on 2016/8/23.
 */
public interface IStudentDao {

    public static final String TABLE_COLUMN_AGE="age";

    public static final String TABLE_COLUME_NAME="name";

    public static final String TABLE_COLUME_ID="id";

    public static final String TABLE_COLUME_PHONENUMBER="phoneNumber";

    public boolean addStudent(Student student);

    public boolean addStudent(List<Student> list);

    public Student getStudentById(int stuID);

    public List<Student> getAllStudent();
}
