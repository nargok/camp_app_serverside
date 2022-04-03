package com.example.campapp.presentation.form

import com.example.campapp.domain.model.Member
import org.jetbrains.exposed.dao.id.EntityID

data class MemberListResponse(val memberList: List<MemberInfo>)

data class MemberInfo(
    val id: Long,
    val name: String,
) {
    constructor(model: Member) : this(model.id as Long, model.name)
}
