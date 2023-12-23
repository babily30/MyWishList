package com.example.mywishlist.Data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface ItemDao {

    @Insert
    suspend fun insert(item: Item) // suspend function - will be called from a corrutine

    @Update
    suspend fun update(item: Item)

    @Delete
    suspend fun delete(item: Item)

    @Query("SELECT * FROM items ORDER BY createdAt DESC")
     fun getAll(): Flow<List<Item>>

    @Query("SELECT * FROM items WHERE id= :id")
     fun getItem(id:Int): Flow<Item>
}