package com.elka.playlistmaker

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

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

        val buttonSearch = findViewById<Button>(R.id.button_search)
        val buttonLibrary = findViewById<Button>(R.id.button_library)
        val buttonSetting = findViewById<Button>(R.id.button_settings)

        val buttonClickListener: View.OnClickListener = object : View.OnClickListener {
            override fun onClick(v: View?) {
                Toast.makeText(this@MainActivity, "Нажали на кнопку \"Поиск\"", Toast.LENGTH_SHORT).show()
            }
        }

        buttonSearch.setOnClickListener(buttonClickListener)
        buttonLibrary.setOnClickListener {
            Toast.makeText(this@MainActivity, "Нажали на кнопку \"Медиатека\"", Toast.LENGTH_SHORT).show()
        }
        buttonSetting.setOnClickListener {
            Toast.makeText(this@MainActivity, "Нажали на кнопку \"Настройки\"", Toast.LENGTH_SHORT).show()
        }
    }
}