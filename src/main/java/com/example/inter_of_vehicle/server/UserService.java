package com.example.inter_of_vehicle.server;

import com.example.inter_of_vehicle.model.User;


import java.sql.SQLException;

/**
 * Created by 小年 on 2018/1/22.
 */
public interface UserService {

    User select(Integer id) throws SQLException;
    User selectByUname(String uname) throws SQLException;
    int insert(User user)throws SQLException;
    User verification(String uname,String password)throws SQLException;
    User update(User user) throws SQLException;
    User delete(String uname)throws SQLException;

}
