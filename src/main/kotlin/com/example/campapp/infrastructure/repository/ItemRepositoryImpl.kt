package com.example.campapp.infrastructure.repository

import com.example.campapp.domain.model.Item
import com.example.campapp.domain.model.Member
import com.example.campapp.domain.repository.ItemRepository
import com.example.campapp.infrastructure.dao.ItemEntity
import com.example.campapp.infrastructure.dao.MemberEntity
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

@Repository
class ItemRepositoryImpl : ItemRepository {
    private val crudEntity = ItemEntity

    @Transactional
    override fun getItemList(): List<Item> {
        return crudEntity.all().map { toModel(it) }
    }

    private fun toModel(entity: ItemEntity): Item {
        return Item(
            id = entity.id.value,
            name = entity.name,
            weight = entity.weight
        )
    }
}