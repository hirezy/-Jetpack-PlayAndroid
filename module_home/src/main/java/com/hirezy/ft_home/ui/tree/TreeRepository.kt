package com.hirezy.ft_home.ui.tree

import com.hirezy.ft_home.api.RequestCenter
import com.hirezy.ft_home.model.tree.TreeData
import com.hirezy.lib_net.model.NetResult
import com.hirezy.lib_net.net.BaseRepository
import com.hirezy.lib_net.net.RetrofitClient


class TreeRepository(private val service: RetrofitClient) : BaseRepository() {

    suspend fun getTreeList(): NetResult<MutableList<TreeData>> {
        return callRequest(call = { requestTreeList() })
    }

    private suspend fun requestTreeList() =
        handleResponse(service.create(RequestCenter::class.java).getTreeList())

}