package com.shindorim.sample.spring_study.controller;

import com.shindorim.sample.spring_study.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

//    1. 필드 주입
//    @Autowired
//    private MemberService memberService;

//    2. 생성자 주입
//    @Autowired
//    public MemberController(MemberService memberService) {
//        this.memberService = memberService;
//    }

//    3. setter 주입
//    @Autowired
//    public void setMemberService(MemberService memberService) {
//        this.memberService = memberService;
//    }
}
