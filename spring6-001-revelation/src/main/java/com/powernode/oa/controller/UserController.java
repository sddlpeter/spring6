package com.powernode.oa.controller;

import com.powernode.oa.service.UserService;
import com.powernode.oa.service.impl.UserServiceImpl;

public class UserController {

    private UserService userService = new UserServiceImpl();

    public void login() {
        String username = "root";
        String password = "123456";

        boolean success = userService.login(username, password);
        if (success) {
            System.out.println("user login success");
        } else {
            System.out.println("user login failed");
        }

    }

    public static void main(String[] args) {
        UserController userController = new UserController();
        userController.login();
    }
}
