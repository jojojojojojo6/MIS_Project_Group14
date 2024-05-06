package com.example.myapp

import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.withContext

class UserRepository (private val dao: UserDao){
    // 檢查帳號是否存在
    suspend fun isEmailExists(account: String): Boolean {
        return withContext(IO) {
            dao.getMemberByEmail(account) != null
        }
    }

    suspend fun signUp(user: User) {
        // 檢查帳號是否已存在
        val emailExists = isEmailExists(user.email)
        if (!emailExists) {
            // 帳號不存在，執行插入操作
            withContext(IO) {
                dao.insert(user)
            }
        } else {
            // 帳號已存在
        }
    }
}