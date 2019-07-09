package com.niit.mapper;

        import com.niit.domain.User;
        import org.springframework.jdbc.core.RowMapper;

        import java.sql.ResultSet;
        import java.sql.SQLException;

/**
 * Created by HP on 2018-3-27.
 * UserRowMapper 工具类
 * RowMapper 接口的功能是：用来将数据库中的列字段和 JavaBean 中属性对应上，
 * 这样就可以赋值了，也像 JDBC 中的 bean.setName(rs.getString("name");
 * Spring 把这段代码抽象出来写成 RowMapper，
 * 即将数据中的每一行封装成一个用户定义的类
 */

public class UserRowMapper implements RowMapper<User>{

       //     如果 RowMapper 后面没有写<User>则下面的 mapRow 则返回为 Object
       public User mapRow(ResultSet resultSet,int i)throws SQLException{
              User user=new User();
              user.setId(resultSet.getInt("id"));
              user.setName(resultSet.getString("name"));
              user.setPassword(resultSet.getString("password"));
              return user;
       }
}
