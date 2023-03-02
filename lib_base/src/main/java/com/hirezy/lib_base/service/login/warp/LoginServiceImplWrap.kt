package com.hirezy.lib_base.service.login.warp

import android.content.Context
import androidx.lifecycle.LiveData
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.launcher.ARouter
import com.hirezy.lib_base.model.User
import com.hirezy.lib_base.service.ConstantsPath
import com.hirezy.lib_base.service.login.LoginService


object LoginServiceImplWrap {

    @Autowired(name = ConstantsPath.LOGIN_SERVICE_PATH)
    lateinit var service: LoginService

    init {
        ARouter.getInstance().inject(this)
    }

    fun isLogin(): Boolean {
        return service.isLogin()
    }


    fun getUserInfo(): User? {
        return service.getUserInfo()
    }

    fun removeUserInfo() {
        service.removeUserInfo()
    }

    fun start(context: Context): LiveData<User> {
        return service.start(context)
    }


    fun getLiveData():LiveData<User>{
        return service.getLiveData()
    }

}