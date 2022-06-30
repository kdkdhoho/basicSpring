package com.example.basicSpring.Member;

import com.example.basicSpring.Member.Member;

public interface MemberService {

    void join(Member member);

    Member findMember(Long memberId);
}
