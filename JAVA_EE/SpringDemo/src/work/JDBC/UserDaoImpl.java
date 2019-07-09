package work.JDBC;

import org.springframework.stereotype.Repository;

@Repository("user")
public class UserDaoImpl implements UserDao{
    @Override
    public void insert(String name) {
           System.out.println(name);
    }
}
