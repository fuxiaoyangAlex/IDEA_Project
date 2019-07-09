package chapter_4_SpringJDBC.com.jdbc.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtil {
    public static DataSource ds = null;

    static{
        try{
            //加载配置文件
            Properties p = new Properties();
            FileInputStream in = new FileInputStream("applicationContext.xml");
            p.load(in);
            System.out.println(p.getProperty("driverClassName"));
            ds = DruidDataSourceFactory.createDataSource(p);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static Connection getConn(){
        try{
            //连接数据库
            return ds.getConnection();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public static void close(Connection conn, Statement stmt, ResultSet rs){
        //释放资源
        if(rs!=null){
            try{
                rs.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }


    }
}
