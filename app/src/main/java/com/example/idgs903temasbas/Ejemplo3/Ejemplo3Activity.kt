package com.example.idgs903temasbas.Ejemplo3

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.idgs903temasbas.R

class Ejemplo3Activity : AppCompatActivity() {

    private lateinit var ed1: EditText
    private var num=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ejemplo3)

        ed1 = findViewById<EditText>(R.id.ed1)
        num = (Math.random() * 100001).toInt()
        val cadena = num.toString()
        val notificacion = Toast.makeText(this,cadena,Toast.LENGTH_SHORT)
        notificacion.show()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun controlar(v: View?){
        val valorIngresado: String = ed1.getText().toString()
        val valor = valorIngresado.toInt()
        if (valor == num){
            val notification = Toast.makeText(this,"Muy bien, recordaste el numero", Toast.LENGTH_SHORT)
            notification.show()
        }else{
            val notification = Toast.makeText(this,"Lo siento, pero ese no es el número que mostre", Toast.LENGTH_SHORT)
            notification.show()
        }
    }
}