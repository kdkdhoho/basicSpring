package com.example.basicSpring.order;

import com.example.basicSpring.AppConfig;
import com.example.basicSpring.Discount.DiscountPolicy;
import com.example.basicSpring.Member.*;
import com.example.basicSpring.Order.Order;
import com.example.basicSpring.Order.OrderService;
import com.example.basicSpring.Order.OrderServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {

    AppConfig appConfig = new AppConfig();
    MemberService memberService = appConfig.memberService();
    OrderService orderService = appConfig.orderService();

    @Test
    void createOrder() {
        Long memberId = 1L;
        Member member = new Member(memberId, "dongho", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "맥북", 1800000);

        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1800000/10);
    }
}
