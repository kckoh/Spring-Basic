package com.example.demo.member;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberServiceImplTest {
    MemberService memberService = new MemberServiceImpl();
    @Test
    void join() {
//        given
        Member member = new Member(1L,"member1",Grade.VIP);


//        when

//        then
    }

    @Test
    void findMember() {
    }
}