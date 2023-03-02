package com.hirezy.ft_tree_detail.service

import android.content.Context
import com.alibaba.android.arouter.facade.annotation.Route
import com.hirezy.ft_tree_detail.ui.TreeDetailActivity
import com.hirezy.lib_base.service.ConstantsPath
import com.hirezy.lib_base.service.treedetail.TreeDetailService

/**
 * Create by liwen on 2020/5/26
 */
@Route(path = ConstantsPath.TREE_DETAIL_SERVICE_PATH)
class TreeDetailServiceImpl :
    TreeDetailService {
    override fun start(context: Context, cid: Int, title: String) {
        TreeDetailActivity.start(context, cid, title)
    }


    override fun init(context: Context?) {

    }
}