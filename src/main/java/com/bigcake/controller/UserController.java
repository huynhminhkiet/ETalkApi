package com.bigcake.controller;

import com.bigcake.model.User;
import com.bigcake.service.Authority;
import com.bigcake.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Collections;

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
        User user = mUserService.getUserLoggedIn();
        user.setPassword(null);
        return user;
    }

    @RequestMapping(path = "/user", method = RequestMethod.POST)
    public User addUser(@RequestBody User user) {
        user.setAuthorities(Collections.singletonList(new Authority("NORMAL_USER")));
        return mUserService.addUser(user);
    }

    @RequestMapping(path = "/user/rank", method = RequestMethod.GET)
    public int getRank() {
        return mUserService.getRank();
    }

    @RequestMapping(path = "/user/highScore/{highScore}", method = RequestMethod.PATCH)
    public int updateHighScore(@PathVariable int highScore) {
        return mUserService.updateHighScore(highScore);
    }
}
