package com.ejemplo.androidmasterlaura

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ejemplo.androidmasterlaura.R.layout

class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_first_app)
        //al arrancar la pantalla es lo principal
    }
}