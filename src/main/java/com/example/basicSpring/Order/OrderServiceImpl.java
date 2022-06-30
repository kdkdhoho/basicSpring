package com.example.basicSpring.Order;

import com.example.basicSpring.Discount.DiscountPolicy;
import com.example.basicSpring.Discount.FixDiscountPolicy;
import com.example.basicSpring.Member.Member;
import com.example.basicSpring.Member.MemberRepository;
import com.example.basicSpring.Member.MemoryMemberRepository;
import com.example.basicSpring.Order.Order;
import com.example.basicSpring.Order.OrderService;

public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
