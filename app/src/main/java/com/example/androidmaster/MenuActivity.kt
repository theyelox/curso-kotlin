package com.example.androidmaster

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.androidmaster.firsapp.FirstAppsActivity
import com.example.androidmaster.R.layout.activity_menu as activity_menu1

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnsaludapp = findViewById<Button>(R.id.btnsaludapp)
        val buttonImcApp = findViewById<Button>(R.id.buttonImcApp)
        btnsaludapp.setOnClickListener { navBottonSalud() }
        buttonImcApp.setOnClickListener { navigateToImcApp() }
    }
 private fun  navigateToImcApp(){

}

   private fun navBottonSalud(){

        val intent = Intent(this, FirstAppsActivity ::class.java)
        startActivity(intent)
    }

}
