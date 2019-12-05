package com.easymall.dao;


import com.easymall.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate = null;

    @Override
    public void addUser(User user) {
        jdbcTemplate.update("insert into user values (null,?,?)",user.getName(),user.getAge());
    }

    @Override
    public User queryUser(int id) {
        return jdbcTemplate.queryForObject("select * from user where id = ?",new BeanPropertyRowMapper<User>(User.class),3);
    }
}
