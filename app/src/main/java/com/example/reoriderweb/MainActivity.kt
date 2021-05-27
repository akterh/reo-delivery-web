package com.example.reoriderweb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    lateinit var reoWeb:WebView
    lateinit var splashImg:ImageView
    lateinit var noInternet:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        reoWeb = findViewById(R.id.reoWeb)
        splashImg = findViewById(R.id.splashScr)
        noInternet = findViewById(R.id.noIntert)
//        reoWeb.loadUrl("facebook.com")

    }

    fun loadWeb(){

    }
}