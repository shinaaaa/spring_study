package com.shindorim.sample.spring_study;

import com.shindorim.sample.spring_study.repository.JdbcMemberRepository;
import com.shindorim.sample.spring_study.repository.JdbcTemplateMemberRepository;
import com.shindorim.sample.spring_study.repository.MemberRepository;
import com.shindorim.sample.spring_study.repository.MemoryMemberRepository;
import com.shindorim.sample.spring_study.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {
    private DataSource dataSource;

    @Autowired
    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
//        return new JdbcMemberRepository(dataSource);
        return new JdbcTemplateMemberRepository(dataSource);
    }
}
