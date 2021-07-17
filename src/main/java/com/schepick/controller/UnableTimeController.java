package com.schepick.controller;

import com.schepick.service.UnableTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page/unable-time")
public class UnableTimeController {
    private final UnableTimeService unableTimeService;
    private final String LOCATION = "/page/unable-time";

    @Autowired
    public UnableTimeController(UnableTimeService unableTimeService) {
        this.unableTimeService = unableTimeService;
    }

    @GetMapping("")
    public String unableTimeForm() {
        return LOCATION;
    }
}
