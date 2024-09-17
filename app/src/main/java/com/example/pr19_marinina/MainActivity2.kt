package com.example.pr19_marinina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class MainActivity2 : AppCompatActivity() {
    private lateinit var butd: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val currentFragment = supportFragmentManager.findFragmentById(R.id.fragment_container)
        if (currentFragment == null) {
            val fragment = Crim()
            supportFragmentManager .beginTransaction()
                .add(R.id.fragment_container,fragment)
                .commit()
        }
    }
    fun Solv(view: View) {
        Snackbar.make(view,"Заявление будет отправлено в полицию", Snackbar.LENGTH_SHORT).show()
    }

    fun Fabcl(view: View) {
        butd = findViewById(R.id.crime_date)
        val nowDate = Date()
        val formattedDate = formatDate(nowDate)
        butd.text = formattedDate
    }

    fun formatDate(date: Date): String {
        val format = SimpleDateFormat("dd-MM-yyyy", Locale.getDefault())
        return format.format(date)
    }
}