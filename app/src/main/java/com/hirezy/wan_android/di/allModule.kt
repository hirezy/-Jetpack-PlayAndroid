package com.hirezy.wan_android.di

import com.google.gson.GsonBuilder
import com.hirezy.ft_home.di.treeRepoModule
import com.hirezy.ft_home.di.treeViewModelModule
import com.hirezy.ft_login.di.loginRepoModule
import com.hirezy.ft_login.di.loginViewModelModule
import com.hirezy.ft_search.di.searchRepoModule
import com.hirezy.ft_search.di.searchViewModelModule
import com.hirezy.ft_tree_detail.di.detailRepoModule
import com.hirezy.ft_tree_detail.di.detailViewModelModule
import com.hirezy.lib_net.net.RetrofitClient
import org.koin.dsl.module

val otherModule = module {

    single {
        RetrofitClient.instance
    }

    single {
        GsonBuilder().disableHtmlEscaping().create()
    }
}


val allModule = listOf(
    otherModule,
    treeRepoModule, treeViewModelModule,
    detailRepoModule, detailViewModelModule,
    loginRepoModule, loginViewModelModule,
    searchRepoModule, searchViewModelModule

)