package sql.bizImpl;

import sql.biz.StudentBiz;
import sql.model.Student;
import sql.model.dao.IStudentDao;
import sql.model.daoImpl.IStudentDaoImpl;

import java.util.List;

/**
 * Created by Administrator on 2016/8/23.
 */
public class StudentBizImpl implements StudentBiz{

    IStudentDao mIStudentDao;

    public StudentBizImpl() {
        mIStudentDao=new IStudentDaoImpl();
    }


    @Override
    public List<Student>  getAllStudent(){
        return mIStudentDao.getAllStudent();
    }

    @Override
    public Student getStudentById(int id) {
        return mIStudentDao.getStudentById(id);
    }

    @Override
    public boolean addStudent(Student student) {
        return mIStudentDao.addStudent(student);
    }

    @Override
    public boolean addStudent(List<Student> list) {
        return mIStudentDao.addStudent(list);
    }
}
