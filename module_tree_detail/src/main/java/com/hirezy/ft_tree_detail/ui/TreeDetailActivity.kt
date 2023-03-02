package com.hirezy.ft_tree_detail.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.launcher.ARouter
import com.scwang.smartrefresh.layout.api.RefreshLayout
import com.hirezy.ft_tree_detail.adapter.TreeDetailListAdapter
import com.hirezy.lib_base.base.AbsListActivity
import com.hirezy.lib_base.model.DatasBean

class TreeDetailActivity : AbsListActivity<DatasBean, TreeDetailViewModel>() {

    @Autowired
    @JvmField
    var cid: Int = 0

    @Autowired
    lateinit var title: String


    override fun initActionBar() {

        mBinding.mTvTitle.text = title
        mBinding.mIvBack.setOnClickListener {
            finish()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        ARouter.getInstance().inject(this)
        super.onCreate(savedInstanceState)
        mViewModel.setCid(cid)
    }

    override fun generateAdapter(): PagedListAdapter<DatasBean, RecyclerView.ViewHolder> {
        return TreeDetailListAdapter(this) as PagedListAdapter<DatasBean, RecyclerView.ViewHolder>
    }

    override fun onLoadMore(refreshLayout: RefreshLayout) {
        finishRefresh()
    }

    override fun onRefresh(refreshLayout: RefreshLayout) {
        mViewModel.getDataSource()?.invalidate()
        finishRefresh()
    }

    companion object {
        fun start(context: Context, cid: Int, title: String) {
            val intent = Intent(context, TreeDetailActivity::class.java)
            intent.putExtra("cid", cid)
            intent.putExtra("title", title)
            context.startActivity(intent)
        }
    }


}
