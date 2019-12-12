package com.example.pickmeup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pickmeup.utils.Utils
import kotlinx.android.synthetic.main.activity_login.*


class SignUp : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        val id = R.drawable.login_background
        Utils.setImageToImageView(applicationContext, bgImageView, id)
    }
}
