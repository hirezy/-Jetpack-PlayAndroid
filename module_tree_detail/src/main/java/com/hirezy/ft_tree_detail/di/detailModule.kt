package com.hirezy.ft_tree_detail.di

import com.hirezy.ft_tree_detail.ui.TreeDetailRepository
import com.hirezy.ft_tree_detail.ui.TreeDetailViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * Create by liwen on 2020/5/22
 */
val detailRepoModule = module {
    factory {
        TreeDetailRepository(get())
    }
}

val detailViewModelModule = module {
    viewModel {
        TreeDetailViewModel(get())
    }
}
