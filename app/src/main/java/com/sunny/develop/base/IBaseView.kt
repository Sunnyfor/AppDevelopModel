package com.sunny.develop.base

import com.sunny.develop.util.factory.ViewType

/**
 * Desc
 * Author JoannChen
 * Mail yongzuo.chen@foxmail.com
 * Date 2019/11/2 00:32
 */
interface IBaseView {

    fun showLoading()

    fun hideLoading()

    fun showView(type: ViewType)

    fun hideView()

    fun showMessage(message: String)
}