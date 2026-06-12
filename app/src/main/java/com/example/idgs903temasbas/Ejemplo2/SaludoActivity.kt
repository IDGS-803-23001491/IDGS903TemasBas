package com.example.idgs903temasbas.Ejemplo2

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.idgs903temasbas.R

class SaludoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_saludo)

        val btnSart = findViewById<AppCompatButton>(R.id.btnStart)
        val edtName = findViewById<AppCompatEditText>(R.id.edtName)

        btnSart.setOnClickListener {
            val name = edtName.text.toString()
            if(name.isNotEmpty()){
                val intent = Intent(this, ResultadoActivity::class.java)
                intent.putExtra("EXTRA_NAME",name)
                startActivity(intent)
            }
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}