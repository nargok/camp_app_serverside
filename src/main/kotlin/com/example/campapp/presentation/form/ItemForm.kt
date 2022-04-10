package com.example.campapp.presentation.form

import com.example.campapp.domain.model.Item

data class ItemListResponse(val itemList: List<ItemInfo>)

data class ItemInfo(
    val id: Long,
    val name: String,
    val weight: Int
) {
    constructor(model: Item): this(model.id as Long, model.name, model.weight)
}

data class ItemRegisterRequest(
    val name: String,
    val weight: Int
)

data class ItemUpdateRequest(
    val id: Long,
    val name: String,
    val weight: Int
)