package com.example.basicSpring.Discount;

import com.example.basicSpring.Member.Grade;
import com.example.basicSpring.Member.Member;

public class FixDiscountPolicy implements DiscountPolicy {
    @Override
    public int discount(Member member, int price) {
        int discountFixAmount = 1000;

        if(member.getGrade() == Grade.VIP)
            return discountFixAmount;

        return 0;
    }
}
