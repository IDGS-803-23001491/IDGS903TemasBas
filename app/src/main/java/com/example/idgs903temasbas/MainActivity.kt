package com.example.idgs903temasbas

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.idgs903temasbas.Ejemplo1.OperasBasActivity
import com.example.idgs903temasbas.Ejemplo2.SaludoActivity
import com.example.idgs903temasbas.Ejemplo3.Ejemplo3Activity
import com.example.idgs903temasbas.Ejemplo4.EjemploTxtActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnOperasBas = findViewById<Button>(R.id.btn1)
        val btnSaludo = findViewById<Button>(R.id.btn2)
        val btn3 = findViewById<Button>(R.id.btn3)
        val btn4 = findViewById<Button>(R.id.btn4)

        btnOperasBas.setOnClickListener { navegateToOperasBas() }
        btnSaludo.setOnClickListener { navegateToSaludo() }
        btn3.setOnClickListener { navegateToEj3() }
        btn4.setOnClickListener { navegateToEj4() }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun navegateToOperasBas() {
        val intent = Intent(this, OperasBasActivity::class.java)
        startActivity(
            intent
        )
    }
    fun navegateToSaludo() {
        val intent = Intent(this, SaludoActivity::class.java)
        startActivity(
            intent
        )
    }

    fun navegateToEj3() {
        val intent = Intent(this, Ejemplo3Activity::class.java)
        startActivity(
            intent
        )
    }

    fun navegateToEj4() {
        val intent = Intent(this, EjemploTxtActivity::class.java)
        startActivity(
            intent
        )
    }
}