package com.schepick.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page/admin")
public class ExcelController {

    private final String LOCATION = "/page/admin";



    @GetMapping("")
    public String addSubjectAndLecture() {

        return "";
    }
}
