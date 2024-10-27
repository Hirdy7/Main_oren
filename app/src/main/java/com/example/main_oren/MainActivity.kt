package com.example.main_oren

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_window)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_Blog -> {
                // Действие при нажатии на элемент "Настройки"
                true
            }
            R.id.action_marshrot -> {
                val intent = Intent(this, List_Of_Tours::class.java)
                startActivity(intent)
                true
            }
            R.id.action_game -> {
                // Действие при нажатии на элемент "Настройки"
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}