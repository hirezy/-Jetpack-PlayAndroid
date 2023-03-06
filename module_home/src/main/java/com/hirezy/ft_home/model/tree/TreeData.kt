package com.hirezy.ft_home.model.tree


data class TreeData(
    val children: MutableList<TreeDataItem>,
    val name: String,
    val id: Int,
    val visible: Int
)