package sql.model.daoImpl;

import sql.model.DBHelper;
import sql.model.Student;
import sql.model.dao.IStudentDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/8/23.
 */
public class IStudentDaoImpl implements IStudentDao{

    Connection mConnect;
    PreparedStatement mPreparedStatement;
    ResultSet mResultSet;

    Student student;
    List<Student> stuList;

    DBHelper mDBHelper;

    public IStudentDaoImpl() {
        mDBHelper=DBHelper.getInstance();
        mConnect = mDBHelper.getConnection();
        stuList=new ArrayList<>();
        student=new Student();
    }

    @Override
    public boolean addStudent(Student student) {
        String sql="INSERT INTO student (name,age,phoneNumber) VALUES (?,?,?)";
        try {
            mPreparedStatement=mConnect.prepareStatement(sql);
            mPreparedStatement.setString(1,student.getName());
            mPreparedStatement.setInt(2,student.getAge());
            mPreparedStatement.setString(3,student.getPhoneNumber());
            return mPreparedStatement.executeUpdate()>0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean addStudent(List<Student> list) {

        if (list==null)return false;

        list.forEach(this::addStudent);
        return true;

    }






    /**
     *
     * @param stuID
     * @return
     */
    @Override
    public Student getStudentById(int stuID) {
        String sql="SELECT name,age,phoneNumber FROM student WHERE id="+stuID;
        try {
            mPreparedStatement=mConnect.prepareStatement(sql);
            mResultSet=mPreparedStatement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (mResultSet==null)return null;
        try {
            mResultSet.next();
            student.setId(stuID);
            student.setName(mResultSet.getString(TABLE_COLUME_NAME));
            student.setAge(mResultSet.getInt(TABLE_COLUMN_AGE));
            student.setPhoneNumber(mResultSet.getString(TABLE_COLUME_PHONENUMBER));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return student;
    }

    /**
     **
     * @return
     */
    @Override
    public List<Student> getAllStudent() {

        String sql="SELECT id,name,age,phoneNumber FROM student";
        try {
            mPreparedStatement=mConnect.prepareStatement(sql);
            mResultSet=mPreparedStatement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //遍历ResultSet

        if (mResultSet==null){
            return null;
        }

        try {
            while (mResultSet.next()){
                student=new Student();
                student.setId(mResultSet.getInt(TABLE_COLUME_ID));
                student.setName(mResultSet.getString(TABLE_COLUME_NAME));
                student.setAge(mResultSet.getInt(TABLE_COLUMN_AGE));
                student.setPhoneNumber(mResultSet.getString(TABLE_COLUME_PHONENUMBER));
                stuList.add(student);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return stuList;
    }
}
