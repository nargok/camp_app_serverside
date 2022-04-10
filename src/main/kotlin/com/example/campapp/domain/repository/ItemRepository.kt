package com.example.campapp.domain.repository

import com.example.campapp.domain.model.Item

interface ItemRepository {
    fun getItemList(): List<Item>

    fun register(item: Item)
}