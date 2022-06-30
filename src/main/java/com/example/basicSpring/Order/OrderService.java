package com.example.basicSpring.Order;

import com.example.basicSpring.Order.Order;

public interface OrderService {

    // 주문 생성
    Order createOrder(Long memberId, String itemName, int itemPrice);

    /*// 회원 조회
    Member findMember(Long id);

    // 할인 적용
    int discount(Member member);*/
}
