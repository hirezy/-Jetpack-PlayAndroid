package com.hirezy.ft_home.ui.navi

import com.hirezy.ft_home.api.RequestCenter
import com.hirezy.ft_home.model.navigation.NavigationItem
import com.hirezy.lib_net.model.NetResult
import com.hirezy.lib_net.net.BaseRepository
import com.hirezy.lib_net.net.RetrofitClient

/**
 * Create by liwen on 2020/5/28
 */
class NavigationRepository(private val service: RetrofitClient) : BaseRepository() {

    suspend fun getNavigationData(): NetResult<MutableList<NavigationItem>> {
        return callRequest(call = { requestNavigationData() })
    }

    private suspend fun requestNavigationData(): NetResult<MutableList<NavigationItem>> =
        handleResponse(service.create(RequestCenter::class.java).getNavigationData())

}