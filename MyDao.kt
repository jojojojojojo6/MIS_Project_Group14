package com.example.database.data.datasource

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.database.data.entity.MemberEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface MyDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(memeberEntity: MemberEntity)

    @Delete
    suspend fun delete(memberEntity: MemberEntity)

    @Update
    suspend fun update(memberEntity: MemberEntity)

    @Query("SELECT * FROM MemberEntity")
    fun getAllMember(): Flow<List<MemberEntity>>

    // 根據帳號查詢成員
    @Query("SELECT * FROM MemberEntity WHERE email = :email")
    suspend fun getMemberByEmail(email: String): MemberEntity?
}
