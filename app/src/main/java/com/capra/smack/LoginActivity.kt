package com.capra.smack

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
    fun loginCreateUserClicked(view:View){
        val createUserIntent = Intent(this, CreateUserActivity::class.java)
        startActivity(createUserIntent)

    }
    fun loginLoginButtonClicked(view: View){

    }
}
