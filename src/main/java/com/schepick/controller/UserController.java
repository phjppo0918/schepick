package com.schepick.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page/user")
public class UserController {

    private String location = "/page/user";

    @GetMapping("")
    public String userForm() {
        return location+"/User-form";
    }

    @PostMapping("")
    public String createUser() {


        return "개인스케줄";
    }
}
