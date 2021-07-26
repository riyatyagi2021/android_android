package com.example.loginpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv4.text=(Html.fromHtml("<b>Sign Up</b>"));


    }
}