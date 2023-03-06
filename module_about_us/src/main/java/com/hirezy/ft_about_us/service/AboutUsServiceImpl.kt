package com.hirezy.ft_about_us.service

import android.content.Context
import com.alibaba.android.arouter.facade.annotation.Route
import com.hirezy.ft_about_us.ui.AboutUsActivity
import com.hirezy.lib_base.service.ConstantsPath
import com.hirezy.lib_base.service.aboutus.AboutUsService

@Route(path = ConstantsPath.ABOUT_US_SERVICE_PATH)
class AboutUsServiceImpl : AboutUsService {

    override fun start(context: Context) {
        AboutUsActivity.start(context)
    }

    override fun init(context: Context) {

    }

}