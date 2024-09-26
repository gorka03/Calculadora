package com.example.calculadoraxml

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button0 : Button = findViewById(R.id.button0)
        val button1 : Button = findViewById(R.id.button1)
        val button2 : Button = findViewById(R.id.button2)
        val button3 : Button = findViewById(R.id.button3)
        val button4 : Button = findViewById(R.id.button4)
        val button5 : Button = findViewById(R.id.button5)
        val button6 : Button = findViewById(R.id.button6)
        val button7 : Button = findViewById(R.id.button7)
        val button8 : Button = findViewById(R.id.button8)
        val button9 : Button = findViewById(R.id.button9)
        val buttonSumar : Button = findViewById(R.id.buttonSumar)
        val buttonRestar : Button = findViewById(R.id.buttonRestar)
        val buttonMultiplicar : Button = findViewById(R.id.buttonMultiplicar)
        val buttonDividir : Button = findViewById(R.id.buttonDividir)
        val buttonAC : Button = findViewById(R.id.buttonBorrar)
        val buttonComa : Button = findViewById(R.id.buttonComa)
        val editTextNumber : EditText = findViewById(R.id.editTextNumber)

        fun mostrarBotonPulsado(numero: String) {
            if (editTextNumber.text.toString() == "0") {
                editTextNumber.setText(numero)
            } else {
                editTextNumber.append(numero)
            }
        }

        button0.setOnClickListener { mostrarBotonPulsado("0") }
        button1.setOnClickListener { mostrarBotonPulsado("1") }
        button2.setOnClickListener { mostrarBotonPulsado("2") }
        button3.setOnClickListener { mostrarBotonPulsado("3") }
        button4.setOnClickListener { mostrarBotonPulsado("4") }
        button5.setOnClickListener { mostrarBotonPulsado("5") }
        button6.setOnClickListener { mostrarBotonPulsado("6") }
        button7.setOnClickListener { mostrarBotonPulsado("7") }
        button8.setOnClickListener { mostrarBotonPulsado("8") }
        button9.setOnClickListener { mostrarBotonPulsado("9") }
        buttonSumar.setOnClickListener { mostrarBotonPulsado ("+")}
        buttonRestar.setOnClickListener { mostrarBotonPulsado("-")}
        buttonMultiplicar.setOnClickListener { mostrarBotonPulsado("X") }
        buttonDividir.setOnClickListener { mostrarBotonPulsado("/") }
        buttonComa.setOnClickListener { mostrarBotonPulsado(",") }
        buttonAC.setOnClickListener { editTextNumber.setText("0") }

    }
}