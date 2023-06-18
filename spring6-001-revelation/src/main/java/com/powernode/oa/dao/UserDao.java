package com.powernode.oa.dao;

import com.powernode.oa.pojo.User;

public interface UserDao {
    User selectByUsernameAndPassword(String username, String password);
}
