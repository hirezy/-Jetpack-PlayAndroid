package com.hirezy.ft_search.api

import com.hirezy.ft_search.model.HotKeyModel
import com.hirezy.ft_search.model.SearchResultModel
import com.hirezy.lib_net.model.BaseModel
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

/**
 * Create by liwen on 2020/6/1
 */
interface RequestCenter {

    @GET("/hotkey/json")
    suspend fun getHotKey(): BaseModel<MutableList<HotKeyModel>>


    @POST(" /article/query/{page}/json")
    suspend fun search(
        @Path("page") page: Int,
        @Query("k") key: String
    ): BaseModel<SearchResultModel>

}