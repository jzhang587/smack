package com.capra.smack.Controller

import android.app.Application
import com.capra.smack.Utilities.SharedPrefs

class App : Application (){

    companion object {
        lateinit var prefs: SharedPrefs
    }

    override fun onCreate() {
        prefs = SharedPrefs (applicationContext)
        super.onCreate()
    }


}