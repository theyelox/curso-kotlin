package com.example.androidmaster.firsapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.example.androidmaster.R

class FirstAppsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_apps)
        val btnStart = findViewById<AppCompatButton>(R.id.btnStart)
       val etName = findViewById<AppCompatEditText>(R.id.etName)


        btnStart.setOnClickListener {
            val name = etName.text.toString()

            if (name.isNotEmpty()) {
                val intent = Intent(this, ResultActivity:: class.java)
                intent.putExtra("EXTRA_NAME", name)
                startActivity(intent)
            }
//enganchar el boton

        }
    }

}
