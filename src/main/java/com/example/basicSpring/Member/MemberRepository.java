package com.example.basicSpring.Member;

import com.example.basicSpring.Member.Member;

public interface MemberRepository {

    void save(Member member);

    Member findById(Long id);
}
