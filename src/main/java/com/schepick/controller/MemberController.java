package com.schepick.controller;

import com.schepick.model.Member;
import com.schepick.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page/member")
public class MemberController {

    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    final String LOCATION = "/page/member";

    @GetMapping( "/new")
    public String signUpForm() {
        return LOCATION + "/new/sign-up-form";
    }

    @PostMapping("/new")
    public String memberJoin(Member memberForm) {
        memberService.join(memberForm);
        return "redirect:/";
    }

}
