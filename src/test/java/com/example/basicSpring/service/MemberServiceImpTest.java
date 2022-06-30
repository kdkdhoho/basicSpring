package com.example.basicSpring.service;

import com.example.basicSpring.AppConfig;
import com.example.basicSpring.Member.Grade;
import com.example.basicSpring.Member.Member;
import com.example.basicSpring.Member.MemberService;
import com.example.basicSpring.Member.MemberServiceImp;
import com.example.basicSpring.Order.OrderService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MemberServiceImpTest {

    MemberService memberService;

    @BeforeEach
    void beforeEach() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }

    @Test
    void joinAndFindById() {
        Member member = new Member(1L, "dongho", Grade.BASIC);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);

        assertThat(findMember).isEqualTo(member);
    }
}