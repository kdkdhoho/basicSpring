package com.example.basicSpring.Discount;

import com.example.basicSpring.Member.Member;

public interface DiscountPolicy {

    /**
     * @return 할인 적용 금액
     */
    int discount(Member member, int price);
}
