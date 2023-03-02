package com.hirezy.ft_home.presenter

import android.content.Context
import com.hirezy.lib_base.service.webview.warp.WebViewWarpService


object HandlerClick {

    fun navigationItemClick(context: Context, title: String, url: String) {
        WebViewWarpService.instance.start(context, title, url)
    }

}