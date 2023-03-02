package com.hirezy.ft_search.service

import android.content.Context
import com.alibaba.android.arouter.facade.annotation.Route
import com.hirezy.ft_search.ui.activity.SearchActivity
import com.hirezy.lib_base.service.ConstantsPath
import com.hirezy.lib_base.service.search.SearchService

/**
 * Create by liwen on 2020/6/1
 */
@Route(path = ConstantsPath.SEARCH_SERVICE_PATH)
class SearchServiceImpl : SearchService {

    override fun start(context: Context) {
        SearchActivity.start(context)
    }

    override fun init(context: Context?) {

    }
}