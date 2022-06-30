package com.example.basicSpring.Discount;

import com.example.basicSpring.Member.Grade;
import com.example.basicSpring.Member.Member;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RateDiscountPolicyTest {

    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Test
    void discount() {
        Member member = new Member(1L, "A", Grade.VIP);

        int discount = discountPolicy.discount(member, 10000);

        assertThat(discount).isEqualTo(10000 / 10);
    }

    @Test
    void discountZero() {
        Member member = new Member(1L, "A", Grade.BASIC);

        int discount = discountPolicy.discount(member, 10000);

        assertThat(discount).isEqualTo(0);
    }
}