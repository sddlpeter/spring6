package com.powernode.oa.dao.impl;

import com.powernode.oa.dao.UserDao;
import com.powernode.oa.pojo.User;

public class UserDaoImplForMySQL implements UserDao {

    @Override
    public User selectByUsernameAndPassword(String username, String password) {
        System.out.println("mysql database verify success");
        return new User();
    }
}
