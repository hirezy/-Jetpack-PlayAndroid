package com.hirezy.ft_about_us.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hirezy.ft_about_us.R
import com.hirezy.lib_base.utils.StatusBarKt
import kotlinx.android.synthetic.main.activity_about_us.*

class AboutUsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        StatusBarKt.fitSystemBar(this)
        setContentView(R.layout.activity_about_us)

        mIvBack.setOnClickListener {
            finish()
        }

    }


    companion object {

        fun start(context: Context) {
            context.startActivity(Intent(context, AboutUsActivity::class.java))
        }

    }
}