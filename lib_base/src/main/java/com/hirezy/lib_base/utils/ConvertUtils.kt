package com.hirezy.lib_base.utils

import android.text.TextUtils
import com.hirezy.lib_base.model.DatasBean


object ConvertUtils {

    @JvmStatic
    fun convertName(feed: DatasBean): String {

        return if (TextUtils.isEmpty(feed.author)) {
            "推荐者：${feed.shareUser}"
        } else {
            "作者：${feed.author}"
        }

    }

}