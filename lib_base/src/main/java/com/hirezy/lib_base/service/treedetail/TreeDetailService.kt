package com.hirezy.lib_base.service.treedetail

import android.content.Context
import com.alibaba.android.arouter.facade.template.IProvider

interface TreeDetailService : IProvider {

    fun start(context: Context, cid: Int, title: String)

}