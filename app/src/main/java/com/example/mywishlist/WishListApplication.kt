package com.example.mywishlist

import android.app.Application
import com.example.mywishlist.Data.AppContainer
import com.example.mywishlist.Data.AppDataContainer

class WishListApplication: Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = AppDataContainer(this)
    }
}