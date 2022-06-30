package com.example.basicSpring.Discount;

import com.example.basicSpring.Member.Grade;
import com.example.basicSpring.Member.Member;

public class RateDiscountPolicy implements DiscountPolicy {

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP)
//            return price * 10 / 100;
            return price / 10;

        return 0;
    }
}
