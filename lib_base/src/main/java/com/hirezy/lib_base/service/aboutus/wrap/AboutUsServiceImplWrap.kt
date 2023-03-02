package com.hirezy.lib_base.service.aboutus.wrap

import android.content.Context
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.launcher.ARouter
import com.hirezy.lib_base.service.ConstantsPath
import com.hirezy.lib_base.service.aboutus.AboutUsService


object AboutUsServiceImplWrap {

    @Autowired(name = ConstantsPath.ABOUT_US_SERVICE_PATH)
    lateinit var service: AboutUsService

    init {
        ARouter.getInstance().inject(this)
    }

    fun start(context: Context) {
        return service.start(context)
    }


}