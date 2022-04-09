package com.example.campapp.presentation.controller

import com.example.campapp.application.service.ItemService
import com.example.campapp.presentation.form.ItemInfo
import com.example.campapp.presentation.form.ItemListResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/item")
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
}