package com.schepick.controller;

import com.schepick.model.User;
import com.schepick.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page/user")
public class UserController {

    private final UserService userService;

    private String location = "/page/user";

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("")
    public String userForm() {
        return location + "/User-form";
    }

    @PostMapping("")
    public String createUser(User form) {
        userService.join(form);
        return location + "/User-unable-time";
    }
}
