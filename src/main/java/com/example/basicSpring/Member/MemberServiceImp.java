package com.example.basicSpring.Member;

import com.example.basicSpring.Member.Member;
import com.example.basicSpring.Member.MemberRepository;
import com.example.basicSpring.Member.MemberService;
import com.example.basicSpring.Member.MemoryMemberRepository;

public class MemberServiceImp implements MemberService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
