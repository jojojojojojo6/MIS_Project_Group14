package com.example.myapp

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface UserDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(User: User)

    @Delete
    suspend fun delete(User: User)

    @Update
    suspend fun update(User: User)

    @Query("SELECT * FROM User")
    fun getAllMember(): Flow<List<User>>

    // 根據帳號查詢成員
    @Query("SELECT * FROM User WHERE email = :email")
    suspend fun getMemberByEmail(email: String): User?
}