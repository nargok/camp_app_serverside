package com.example.campapp.application.service

import com.example.campapp.domain.model.Item
import com.example.campapp.domain.repository.ItemRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class ItemService(
    private val itemRepository: ItemRepository
) {
    @Transactional
    fun getItemList(): List<Item> {
        return itemRepository.getItemList()
    }

    @Transactional
    fun getItem(itemId: Long): Item? {
        return itemRepository.getItem(itemId)
    }

    @Transactional
    fun registerItem(item: Item) {
        itemRepository.register(item)
    }

    @Transactional
    fun updateItem(item: Item) {
        itemRepository.update(item)
    }
}