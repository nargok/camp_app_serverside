package com.example.campapp.application.service

import com.example.campapp.domain.model.Item
import com.example.campapp.domain.repository.ItemRepository
import org.springframework.stereotype.Service

@Service
class ItemService(
    private val itemRepository: ItemRepository
) {
    fun getItemList(): List<Item> {
        return itemRepository.getItemList()
    }
}