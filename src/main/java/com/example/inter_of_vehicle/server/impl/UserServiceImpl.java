package com.example.inter_of_vehicle.server.impl;

import com.example.inter_of_vehicle.dao.UserDao;
import com.example.inter_of_vehicle.model.User;
import com.example.inter_of_vehicle.server.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.SQLException;

/**
 * Created by 小年 on 2018/1/22.
 */
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User select(Integer id) throws SQLException {
        return userDao.select(id);
    }

    @Override
    public User selectByUname(String uname) throws SQLException {
        return userDao.selectByUname(uname);
    }

    @Override
    public int insert(User user) throws SQLException {
        userDao.insert(user);
        return 0;
    }

    @Override
    public User verification(String uname, String password) throws SQLException {
        return userDao.verification(uname,password);
    }

    @Override
    public User update(User user) throws SQLException {
        return null;
    }


    @Override
    public User delete(String uname) throws SQLException {
        return null;
    }

}
