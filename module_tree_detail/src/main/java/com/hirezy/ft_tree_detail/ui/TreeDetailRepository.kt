package com.hirezy.ft_tree_detail.ui

import com.hirezy.ft_tree_detail.api.ReqeustCenter
import com.hirezy.ft_tree_detail.model.TreeDetailModel
import com.hirezy.lib_net.model.NetResult
import com.hirezy.lib_net.net.BaseRepository
import com.hirezy.lib_net.net.RetrofitClient

/**
 * Create by liwen on 2020-05-21
 */
class TreeDetailRepository(private val service: RetrofitClient) : BaseRepository() {

    suspend fun getTreeDetailList(count: Int, cid: Int): NetResult<TreeDetailModel> {

        return callRequest(call = { requestTreeDetailList(count, cid) })
    }

    private suspend fun requestTreeDetailList(count: Int, cid: Int) =
        handleResponse(
            service.create(ReqeustCenter::class.java).getTreeDetailList(count, cid)
        )
}