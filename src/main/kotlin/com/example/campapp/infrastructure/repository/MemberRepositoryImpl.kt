package com.example.campapp.infrastructure.repository

import com.example.campapp.domain.model.Member
import com.example.campapp.domain.repository.MemberRepository
import com.example.campapp.infrastructure.dao.MemberEntity
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

@Repository
class MemberRepositoryImpl(
) : MemberRepository {

    @Transactional
    override fun getMemberList(): List<Member> {
        return MemberEntity.all().map { toModel(it) }
    }

    private fun toModel(entity: MemberEntity): Member {
        return Member(
            id = entity.id.value,
            name = entity.name
        )
    }
}