package com.example.campapp.presentation.controller

import com.example.campapp.application.service.MemberService
import com.example.campapp.domain.model.Member
import com.example.campapp.presentation.form.MemberInfo
import com.example.campapp.presentation.form.MemberListResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController()
@RequestMapping("/member")
class MemberController(
    private val memberService: MemberService
) {
    @GetMapping("/list")
    fun getList() : MemberListResponse {
//        return MemberListResponse(memberService.getMemberList())
        val memberList = memberService.getMemberList().map {
            MemberInfo(it)
        }
        return MemberListResponse(memberList)
    }
}