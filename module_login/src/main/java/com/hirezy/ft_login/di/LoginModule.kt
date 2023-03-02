package com.hirezy.ft_login.di

import com.hirezy.ft_login.ui.LoginRepository
import com.hirezy.ft_login.ui.LoginViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module



val loginRepoModule = module {
    single {
        LoginRepository(get())
    }
}


val loginViewModelModule = module {
    viewModel {
        LoginViewModel(get())
    }
}