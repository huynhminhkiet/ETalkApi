package com.bigcake.controller;

import com.bigcake.model.User;
import com.bigcake.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Bigcake on 9/9/2017
 */

@RestController
public class UserController {

    private UserService mUserService;

    @Autowired
    public UserController(UserService mUserService) {
        this.mUserService = mUserService;
    }

    @RequestMapping("/user/profile")
    public User getUserLoggedIn() {
        return mUserService.getUserLoggedIn();
    }
}
