package com.powernode.dao.impl;

import com.powernode.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoForMySQL implements UserDao {
    @Override
    public void insert() {
        System.out.println("insert data to MySQL database...");
    }
}
