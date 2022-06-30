package com.example.basicSpring;

import com.example.basicSpring.Discount.DiscountPolicy;
import com.example.basicSpring.Discount.RateDiscountPolicy;
import com.example.basicSpring.Member.MemberRepository;
import com.example.basicSpring.Member.MemberService;
import com.example.basicSpring.Member.MemberServiceImp;
import com.example.basicSpring.Member.MemoryMemberRepository;
import com.example.basicSpring.Order.OrderService;
import com.example.basicSpring.Order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        return new MemberServiceImp(memberRepository());
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }
}
