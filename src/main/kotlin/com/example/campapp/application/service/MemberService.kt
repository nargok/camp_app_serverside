package com.example.campapp.application.service

import com.example.campapp.domain.model.Member
import com.example.campapp.domain.repository.MemberRepository
import org.springframework.stereotype.Service

@Service
class MemberService(
    private val memberRepository: MemberRepository
) {
    fun getMemberList(): List<Member> {
        return memberRepository.getMemberList()
    }
}