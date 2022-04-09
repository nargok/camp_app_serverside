package com.example.campapp.domain.repository

import com.example.campapp.domain.model.Member

interface MemberRepository {
    fun getMemberList(): List<Member>
}