package com.example.mywishlist.Data

import kotlinx.coroutines.flow.Flow

interface WishListRepository {
    fun getWishList(): Flow<List<Item>>
    fun getWishListItem(id: Int): Flow<Item>
    suspend fun addItem(item: Item)
    suspend fun removeItem(item: Item)
    suspend fun updateItem(item: Item)

}