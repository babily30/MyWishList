package com.example.mywishlist.Data

import android.content.Context
interface AppContainer {
    val itemsRepository: WishListRepository
}

class AppDataContainer(private val context: Context) : AppContainer {

    override val itemsRepository: WishListRepository by lazy {
        LocalWishListTRepository(WishListDatabase.getDatabase(context).itemDao())
    }
}