package com.hirezy.ft_search.di

import com.hirezy.ft_search.ui.viewmodel.HotKeyViewModel
import com.hirezy.ft_search.ui.repository.SearchRepository
import com.hirezy.ft_search.ui.viewmodel.SearchResultViewModel
import com.hirezy.ft_search.ui.viewmodel.SearchViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * Create by liwen on 2020/6/1
 */

val searchRepoModule = module {
    single {
        SearchRepository(get())
    }
}

val searchViewModelModule = module {

    viewModel {
        SearchViewModel(get())
    }
    viewModel {
        HotKeyViewModel(get())
    }

    viewModel { SearchResultViewModel(get()) }
}