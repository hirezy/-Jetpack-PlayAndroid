package com.hirezy.wan_android

import android.app.Application
import com.alibaba.android.arouter.launcher.ARouter
import com.tencent.mmkv.MMKV
import com.hirezy.lib_base.utils.BaseContext
import com.hirezy.wan_android.di.allModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

/**
 * Create by liwen on 2020-05-18
 */
class App : Application() {

    override fun onCreate() {
        super.onCreate()

        BaseContext.instance.init(this)
        ARouter.init(this)
        MMKV.initialize(this)

        startKoin {
            androidContext(this@App)
            modules(allModule)
        }

    }
}