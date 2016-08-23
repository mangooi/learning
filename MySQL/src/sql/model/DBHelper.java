package sql.model;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 辅助和数据库进行连接:
 *      1.提供几个常量:user pwd url driver
 *      2.提供获取连接方法
 *      3.提供各种关闭方法
 *
 * Created by Administrator on 2016/8/23.
 */
public class DBHelper {

    private final static DBHelper dbHelper=new DBHelper();

    private DBHelper(){

    }

    Connection mConnection;

    public static final String USER="root";

    public static final String PWD="1234";
    //连接驱动类的完整类名
    public static final String DRIVER="com.mysql.jdbc.Driver";
    //                                    协议://地址:端口/数据库名称
    public static final String URL="jdbc:mysql://localhost:3306/test";

    public static DBHelper getInstance(){
        return dbHelper;
    }

    public Connection getConnection(){
        if (mConnection!=null) return mConnection;

        try {
            Class.forName(DRIVER);
            mConnection=DriverManager.getConnection(URL,USER,PWD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return mConnection;
    }

    public void closeConnection(Connection connection) throws SQLException {
        if (connection==null)return;
        connection.close();
        connection=null;
    }


}
