package com.spring_security_test.demo.service;

import com.spring_security_test.demo.entity.Member;
import com.spring_security_test.demo.repository.MemberRepository;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    private MemberRepository memberRepository;

    public void memberInsert(Member member) {
        memberRepository.save(member);
    }
}
