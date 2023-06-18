package com.powernode.dao.impl;

import com.powernode.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoForOracle implements UserDao {
    @Override
    public void insert() {
        System.out.println("insert data into Oracle database...");
    }
}