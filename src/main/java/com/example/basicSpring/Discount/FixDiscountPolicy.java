package com.example.basicSpring.Discount;

import com.example.basicSpring.Member.Grade;
import com.example.basicSpring.Member.Member;

public class FixDiscountPolicy implements DiscountPolicy {

    private final int discountFixAmount = 1000;

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP)
            return discountFixAmount;

        return 0;
    }
}
