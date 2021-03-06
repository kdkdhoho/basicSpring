package com.example.basicSpring.Member;

import com.example.basicSpring.Member.Member;
import com.example.basicSpring.Member.MemberRepository;

import java.util.*;

public class MemoryMemberRepository implements MemberRepository {

    private static final Map<Long, Member> store = new HashMap<>();

    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
