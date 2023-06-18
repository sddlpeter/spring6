package com.powernode.spring6.service;

import com.powernode.spring6.dao.OrderDao;
import com.powernode.spring6.dao.UserDao;

public class UserService {
    public void UserService() {
        System.out.println("UserService 无参构造方法被执行...");
    }

    private UserDao aaa;
    private OrderDao orderDao;

    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    public void setUserDao(UserDao userDao) {
        this.aaa = userDao;
    }

    public void save() {
        aaa.insert();
    }

    public void delete() {
        orderDao.deleteById();
    }
}
