package com.elka.playlistmaker

import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_settings)

        val screenLayout = findViewById<View>(R.id.main)
        val indentLeft = screenLayout.paddingLeft
        val indentTop = screenLayout.paddingTop
        val indentRight = screenLayout.paddingRight
        val indentBottom = screenLayout.paddingBottom

        ViewCompat.setOnApplyWindowInsetsListener(screenLayout) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left + indentLeft, systemBars.top + indentTop, systemBars.right + indentRight, systemBars.bottom + indentBottom)
            insets
        }

        val buttonBack = findViewById<ImageButton>(R.id.button_back)

        buttonBack.setOnClickListener {
            finish()
        }
    }
}