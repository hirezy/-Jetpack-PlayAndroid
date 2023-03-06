package com.hirezy.lib_base.service.webview

import android.content.Context
import com.alibaba.android.arouter.facade.template.IProvider

interface WebViewService : IProvider {

    fun start(
        context: Context, title: String
        , url: String
    )
}