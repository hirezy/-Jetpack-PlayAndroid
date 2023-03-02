package com.hirezy.ft_home.ui.home

import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hirezy.ft_home.model.home.Banner
import com.hirezy.lib_base.utils.BaseContext
import com.hirezy.lib_net.model.NetResult
import kotlinx.coroutines.launch

class HomeViewModel(private val homeRepository: HomeRepository) : ViewModel() {

    private val bannerLiveData = MutableLiveData<List<Banner>>()

    fun getBannerLiveData(): MutableLiveData<List<Banner>> {
        return bannerLiveData
    }


    fun getBanner() {

        viewModelScope.launch {
            val banner = homeRepository.getBanner()
            if (banner is NetResult.Success) {
                bannerLiveData.postValue(banner.data)
            } else if (banner is NetResult.Error) {
                Toast.makeText(
                    BaseContext.instance.getContext(),
                    banner.exception.msg,
                    Toast.LENGTH_LONG
                ).show()
            }
        }

    }

}