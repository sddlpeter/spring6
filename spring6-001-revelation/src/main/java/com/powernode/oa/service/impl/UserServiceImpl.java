package com.powernode.oa.service.impl;

import com.powernode.oa.dao.UserDao;
import com.powernode.oa.dao.impl.UserDaoImplForMySQL;
import com.powernode.oa.dao.impl.UserDaoImplForOracle;
import com.powernode.oa.pojo.User;
import com.powernode.oa.service.UserService;

public class UserServiceImpl implements UserService {
    // private UserDao userDao = new UserDaoImplForMySQL();
    private UserDao userDao = new UserDaoImplForOracle();

    @Override
    public boolean login(String username, String password) {
        User user = userDao.selectByUsernameAndPassword(username, password);
        if (user != null) {
            return true;
        } else {
            return false;
        }
    }
}
