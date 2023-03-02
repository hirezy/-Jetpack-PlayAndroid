package com.hirezy.ft_login.ui

import com.hirezy.ft_login.api.RequestCenter
import com.hirezy.lib_base.model.User
import com.hirezy.lib_net.model.NetResult
import com.hirezy.lib_net.net.BaseRepository
import com.hirezy.lib_net.net.RetrofitClient

class LoginRepository(private val service: RetrofitClient) : BaseRepository() {

    suspend fun login(username: String, password: String): NetResult<User> {
        return callRequest(call = { requestLogin(username, password) })
    }

    suspend fun register(
        username: String,
        password: String,
        surePassword: String
    ): NetResult<User> {
        return callRequest(call = { requestRegister(username, password, surePassword) })
    }

    private suspend fun requestLogin(username: String, password: String): NetResult<User> =
        handleResponse(
            service.create(RequestCenter::class.java).login(username, password)
        )

    private suspend fun requestRegister(
        username: String,
        password: String,
        surePassword: String
    ): NetResult<User> =
        handleResponse(
            service.create(RequestCenter::class.java).register(username, password, surePassword)
        )


}