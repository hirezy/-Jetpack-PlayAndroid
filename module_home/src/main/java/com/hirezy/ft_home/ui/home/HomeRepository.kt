package com.hirezy.ft_home.ui.home

import com.hirezy.ft_home.api.RequestCenter
import com.hirezy.ft_home.model.home.Banner
import com.hirezy.ft_home.model.home.DataFeed
import com.hirezy.lib_net.net.BaseRepository
import com.hirezy.lib_net.net.RetrofitClient
import com.hirezy.lib_net.model.NetResult

/**
 * Create by liwen on 2020-05-18
 */
class HomeRepository(private val service: RetrofitClient) : BaseRepository() {

    suspend fun getBanner(): NetResult<List<Banner>> {
        return callRequest(call = { requestBanner() })
    }

    suspend fun getHomeList(count: Int): NetResult<DataFeed> {
        return callRequest(call = { requestHomeList(count) })
    }

    private suspend fun requestBanner() =
        handleResponse(service.create(RequestCenter::class.java).getBanner())

    private suspend fun requestHomeList(count: Int) =
        handleResponse(
            service.create(RequestCenter::class.java).getHomeList(count)
        )


}