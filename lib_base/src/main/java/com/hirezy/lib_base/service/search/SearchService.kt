package com.hirezy.lib_base.service.search

import android.content.Context
import com.alibaba.android.arouter.facade.template.IProvider

interface SearchService : IProvider {

    fun start(context: Context)

}