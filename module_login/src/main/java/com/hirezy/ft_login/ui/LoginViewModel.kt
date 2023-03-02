package com.hirezy.ft_login.ui

import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hirezy.lib_base.model.User
import com.hirezy.lib_base.utils.BaseContext
import com.hirezy.lib_net.model.NetResult
import kotlinx.coroutines.launch


class LoginViewModel(private val loginRepo: LoginRepository) : ViewModel() {


    private val loginLiveData = MutableLiveData<User>()

    fun login(username: String, password: String): MutableLiveData<User> {
        viewModelScope.launch {
            val user = loginRepo.login(username, password)
            if (user is NetResult.Success) {
                loginLiveData.postValue(user.data)
            } else if (user is NetResult.Error) {
                Toast.makeText(
                    BaseContext.instance.getContext(),
                    user.exception.msg,
                    Toast.LENGTH_LONG
                ).show()
            }

        }

        return loginLiveData
    }

    fun register(username: String, password: String, surePassword: String): MutableLiveData<User> {
        viewModelScope.launch {
            val user = loginRepo.register(username, password, surePassword)
            if (user is NetResult.Success) {
                loginLiveData.postValue(user.data)
            } else if (user is NetResult.Error) {
                Toast.makeText(
                    BaseContext.instance.getContext(),
                    user.exception.msg,
                    Toast.LENGTH_LONG
                ).show()
            }

        }

        return loginLiveData
    }

}