package com.example.mywishlist.Data

class LocalWishListTRepository(private val itemDao: ItemDao): WishListRepository {
    override fun getWishList() = itemDao.getAll()
    override fun getWishListItem(id: Int) = itemDao.getItem(id)
    override suspend fun addItem(item: Item) = itemDao.insert(item)
    override suspend fun removeItem(item: Item)  = itemDao.delete(item)
    override suspend fun updateItem(item: Item)  = itemDao.update(item)
}