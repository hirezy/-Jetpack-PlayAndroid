package com.hirezy.ft_home.`interface`

import com.hirezy.ft_home.model.navigation.NavigationItem

/**
 * Create by liwen on 2020/5/29
 */
interface NavigationTabItemSelectedListener {
    fun onItemSelected(item: NavigationItem, position: Int)
}