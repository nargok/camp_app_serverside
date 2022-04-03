package com.example.campapp.presentation.controller

import com.example.campapp.domain.model.Member
import com.example.campapp.presentation.form.MemberListResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController()
@RequestMapping("/member")
class MemberController {
    @GetMapping("/list")
    fun getList() : MemberListResponse {
        val memberList = listOf<Member>(Member(1, "taro"), Member(2, "Jiro"))
        return MemberListResponse(memberList)
    }
}