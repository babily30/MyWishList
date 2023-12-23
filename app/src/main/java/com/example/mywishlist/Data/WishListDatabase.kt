package com.example.mywishlist.Data

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
//ye boilerplate hai vo bus copy and paste
abstract class WishListDatabase : RoomDatabase() {

    abstract fun itemDao(): ItemDao

    companion object {
        @Volatile
        private var Instance: WishListDatabase? = null

        fun getDatabase(context: Context): WishListDatabase {
            // if the Instance is not null, return it, otherwise create a new database instance.
            return Instance ?: synchronized(this) {
                Room.databaseBuilder(context, WishListDatabase::class.java, "wishlist_database")
                    .build()
                    .also { Instance = it }
            }
        }
    }
}
