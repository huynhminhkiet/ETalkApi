package com.bigcake.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 19/04/2018.
 */

@Controller
public class WelcomeController {

    @RequestMapping(value = "/welcome")
    public String showWelcome() {
        return "welcome";
    }
}
