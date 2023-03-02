package com.hirezy.ft_home.ui.project

import com.hirezy.ft_home.api.RequestCenter
import com.hirezy.ft_home.model.project.ProjectPageItem
import com.hirezy.ft_home.model.project.ProjectTabItem
import com.hirezy.lib_net.model.NetResult
import com.hirezy.lib_net.net.BaseRepository
import com.hirezy.lib_net.net.RetrofitClient

/**
 * Create by liwen on 2020/5/26
 */
class ProjectRepository(private val service: RetrofitClient) : BaseRepository() {


    suspend fun getTabData(): NetResult<MutableList<ProjectTabItem>> {
        return callRequest(call = { requestTabData() })
    }

    private suspend fun requestTabData() =
        handleResponse(service.create(RequestCenter::class.java).getTabData())


    suspend fun getTabItemPageData(count: Int, id: Int): NetResult<ProjectPageItem> {
        return callRequest(call = { requestTabItemPageData(count, id) })
    }

    private suspend fun requestTabItemPageData(count: Int, id: Int) =
        handleResponse(
           service.create(RequestCenter::class.java).getTabItemPageData(count, id)
        )
}