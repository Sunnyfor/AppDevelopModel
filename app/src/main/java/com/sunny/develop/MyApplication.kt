package com.sunny.develop

import android.app.Application

/**
 * Desc 全局管理类
 * Author JoannChen
 * Mail yongzuo.chen@foxmail.com
 * Date 2019/10/22 13:28
 */
class MyApplication : Application() {

    /**
     * 单例
     */
    companion object {

        private lateinit var instance: MyApplication

        fun getInstance(): MyApplication = instance

    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

}