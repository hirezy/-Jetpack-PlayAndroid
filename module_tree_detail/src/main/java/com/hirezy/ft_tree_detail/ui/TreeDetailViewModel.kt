package com.hirezy.ft_tree_detail.ui

//import com.hirezy.lib_base.App
import android.widget.Toast
import androidx.lifecycle.viewModelScope
import androidx.paging.DataSource
import androidx.paging.PageKeyedDataSource
import com.hirezy.lib_base.base.AbsListViewModel
import com.hirezy.lib_base.model.DatasBean
import com.hirezy.lib_base.utils.BaseContext
import com.hirezy.lib_net.model.NetResult
import kotlinx.coroutines.launch
import java.util.*


class TreeDetailViewModel(private val dataRepos: TreeDetailRepository) :
    AbsListViewModel<DatasBean>() {

    private var mCid: Int = 0

    fun setCid(cid: Int) {
        mCid = cid
    }

    override fun createDataSource(): DataSource<Int, DatasBean> {
        return object : PageKeyedDataSource<Int, DatasBean>() {
            override fun loadInitial(
                params: LoadInitialParams<Int>,
                callback: LoadInitialCallback<Int, DatasBean>
            ) {
                loadData(0, callback)
            }

            override fun loadAfter(
                params: LoadParams<Int>,
                callback: LoadCallback<Int, DatasBean>
            ) {
                loadData(params.key, callback)
            }

            override fun loadBefore(
                params: LoadParams<Int>,
                callback: LoadCallback<Int, DatasBean>
            ) {
                callback.onResult(Collections.emptyList(), null)
            }
        }

    }

    private fun loadData(
        key: Int,
        callback: PageKeyedDataSource.LoadInitialCallback<Int, DatasBean>
    ) {

        viewModelScope.launch {
            val result = dataRepos.getTreeDetailList(key, mCid)
            if (result is NetResult.Success) {
                callback.onResult(result.data.datas, null, 1)
            } else if (result is NetResult.Error) {
                Toast.makeText(
                    BaseContext.instance.getContext(),
                    result.exception.msg,
                    Toast.LENGTH_LONG
                ).show()
            }
        }

    }

    private fun loadData(
        key: Int,
        callback: PageKeyedDataSource.LoadCallback<Int, DatasBean>
    ) {
        viewModelScope.launch {
            val result = dataRepos.getTreeDetailList(key, mCid)
            if (result is NetResult.Success) {
                callback.onResult(result.data.datas, key + 1)
            } else if (result is NetResult.Error) {
                Toast.makeText(
                    BaseContext.instance.getContext(),
                    result.exception.msg,
                    Toast.LENGTH_LONG
                ).show()
            }
        }

    }


}