package com.example.campapp.domain.repository

import com.example.campapp.domain.model.Member
import org.springframework.stereotype.Repository

interface MemberRepository {
    fun getMemberList(): List<Member>
}