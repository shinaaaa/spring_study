package com.shindorim.sample.spring_study.controller;

import com.shindorim.sample.spring_study.domain.Member;
import com.shindorim.sample.spring_study.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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

    @GetMapping("/members/new")
    public String createForm() {
        return "members/createMemberForm";
    }

    @PostMapping("/members/new")
    public String create(MemberForm form) {
        Member member = new Member();
        member.setName(form.getName());

        memberService.join(member);

        return "redirect:/";
    }
}
