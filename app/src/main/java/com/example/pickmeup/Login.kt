package com.example.pickmeup

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.pickmeup.utils.Utils
import kotlinx.android.synthetic.main.activity_login.*


class Login : AppCompatActivity() {
// another change
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        initDataBindings()

        initActions()

    }

    private fun initDataBindings() {
        val id = R.drawable.login_background
        Utils.setImageToImageView(applicationContext, bgImageView, id)
    }

    private fun initActions() {
        forgotButton.setOnClickListener {Toast.makeText(applicationContext, "Clicked Forgot Password", Toast.LENGTH_SHORT).show() }

        createTextView.setOnClickListener { Toast.makeText(applicationContext, "Clicked Create Account", Toast.LENGTH_SHORT).show() }

        loginButton.setOnClickListener {

            val intent = Intent(this,fragment_all::class.java)
            startActivity(intent)
//            Toast.makeText(applicationContext, "Clicked Login", Toast.LENGTH_SHORT).show()
        }

    }
    //endregion
}
