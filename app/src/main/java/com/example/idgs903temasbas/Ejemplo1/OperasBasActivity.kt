package com.example.idgs903temasbas.Ejemplo1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.idgs903temasbas.R

class OperasBasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        lateinit var editNumero1 : EditText
        lateinit var editNumero2 : EditText
        lateinit var btnSumar : Button
        lateinit var btnRestar : Button
        lateinit var btnMultiplicar : Button
        lateinit var btnDividir : Button
        lateinit var txtResultado : TextView
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_operas_bas)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        editNumero1 = findViewById<EditText>(R.id.edt1)
        editNumero2 = findViewById<EditText>(R.id.edt2)
        btnSumar = findViewById<Button>(R.id.btn1)
        btnRestar = findViewById<Button>(R.id.btn2)
        btnMultiplicar = findViewById<Button>(R.id.btn3)
        btnDividir = findViewById<Button>(R.id.btn4)
        txtResultado = findViewById<EditText>(R.id.txtResultado)

        btnSumar.setOnClickListener {
            val num1 = Integer.parseInt(editNumero1.text.toString())
            val num2 = Integer.parseInt(editNumero2.text.toString())

            txtResultado.setText("Resultado: " + sumar(num1,num2))
        }

        btnRestar.setOnClickListener {
            val num1 = Integer.parseInt(editNumero1.text.toString())
            val num2 = Integer.parseInt(editNumero2.text.toString())

            txtResultado.setText("Resultado: " + restar(num1,num2))
        }

        btnMultiplicar.setOnClickListener {
            val num1 = Integer.parseInt(editNumero1.text.toString())
            val num2 = Integer.parseInt(editNumero2.text.toString())

            txtResultado.setText("Resultado: " + multiplicar(num1,num2))
        }

        btnDividir.setOnClickListener {
            val num1 = Integer.parseInt(editNumero1.text.toString())
            val num2 = Integer.parseInt(editNumero2.text.toString())

            txtResultado.setText("Resultado: " + dividir(num1,num2))
        }
    }

    fun sumar(numero1: Int, numero2: Int):Int{
        return numero1+numero2
    }

    fun restar(numero1: Int, numero2: Int):Int{
        return numero1-numero2
    }

    fun multiplicar(numero1: Int, numero2: Int):Int{
        return numero1*numero2
    }

    fun dividir(numero1: Int, numero2: Int): Double{
        return (numero1).toDouble() / (numero2).toDouble()
    }
}