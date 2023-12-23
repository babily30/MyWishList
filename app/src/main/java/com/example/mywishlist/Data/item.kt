package com.example.mywishlist.Data

import androidx.room.Entity
import androidx.room.PrimaryKey

enum class Priority{
    High,
    Medium,
    Low
}

@Entity(tableName = "items")
data class Item(
    @PrimaryKey(autoGenerate = true) val id: Int=0,
    val title: String,
    val website: String,
    val img: String = "",
    val imgLocal:Int = 0,
    val priority: Priority = Priority.Low, //enum in Room is Stored as int
    val isImgLocal: Boolean = false, // boolean in Room is stored as Int
    val createdAt: Long = System.currentTimeMillis() // timestamp
)
