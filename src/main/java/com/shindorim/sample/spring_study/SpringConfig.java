package com.shindorim.sample.spring_study;

import com.shindorim.sample.spring_study.repository.MemberRepository;
import com.shindorim.sample.spring_study.repository.MemoryMemberRepository;
import com.shindorim.sample.spring_study.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }
    
    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
