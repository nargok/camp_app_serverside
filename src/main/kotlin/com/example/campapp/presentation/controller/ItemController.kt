package com.example.campapp.presentation.controller

import com.example.campapp.application.service.ItemService
import com.example.campapp.domain.model.Item
import com.example.campapp.presentation.form.ItemInfo
import com.example.campapp.presentation.form.ItemListResponse
import com.example.campapp.presentation.form.ItemRegisterRequest
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/item")
@CrossOrigin
class ItemController(
    private val itemService: ItemService
) {
    @GetMapping("/list")
    fun getList(): ItemListResponse {
        val itemList = itemService.getItemList().map {
            ItemInfo(it)
        }
        return ItemListResponse(itemList)
    }

    @PostMapping("/register")
    fun register(@RequestBody request: ItemRegisterRequest) {
        val dummyId = 99999L
        itemService.registerItem(Item(dummyId, request.name, request.weight))
    }
}