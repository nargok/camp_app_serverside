package com.example.campapp.presentation.controller

import com.example.campapp.application.service.ItemService
import com.example.campapp.domain.model.Item
import com.example.campapp.presentation.form.ItemInfo
import com.example.campapp.presentation.form.ItemListResponse
import com.example.campapp.presentation.form.ItemRegisterRequest
import com.example.campapp.presentation.form.ItemUpdateRequest
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

    @GetMapping("/{id}")
    fun getItem(@PathVariable("id") itemId: Long): ItemInfo? {
        val item = itemService.getItem(itemId)
        return item?.let { ItemInfo(it) }
    }

    @PostMapping("/register")
    fun register(@RequestBody request: ItemRegisterRequest) {
        val dummyId = 99999L
        itemService.registerItem(Item(dummyId, request.name, request.weight))
    }

    @PutMapping("/update")
    fun update(@RequestBody request: ItemUpdateRequest) {
        itemService.updateItem(Item(request.id, request.name, request.weight))
    }
}