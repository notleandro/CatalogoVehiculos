package com.example.catalogo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class DeveloperActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_developer)
    }

    fun volver(view: android.view.View) {
        finish()
    }
}
