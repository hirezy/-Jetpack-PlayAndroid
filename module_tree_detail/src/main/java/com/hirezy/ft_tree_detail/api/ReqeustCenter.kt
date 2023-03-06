package com.hirezy.ft_tree_detail.api

import com.hirezy.ft_tree_detail.model.TreeDetailModel
import com.hirezy.lib_net.model.BaseModel
import retrofit2.http.*


interface ReqeustCenter {

    @GET(value = "/article/list/{count}/json")
    suspend fun getTreeDetailList(
        @Path("count") count: Int,
        @Query("cid") cid: Int
    ): BaseModel<TreeDetailModel>



}