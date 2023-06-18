package com.powernode.oa.dao.impl;

import com.powernode.oa.dao.UserDao;
import com.powernode.oa.pojo.User;

public class UserDaoImplForOracle implements UserDao {
    @Override
    public User selectByUsernameAndPassword(String username, String password) {
        System.out.println("oracle database verify success!");
        return new User();
    }
}
