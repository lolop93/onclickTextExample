package com.tdam.onclicktext

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        val button = findViewById<Button>(R.id.button)


        button.setOnClickListener {
            // Cambiar el texto
            textView.text = "Nuevo Texto"

            // Cambiar el color de fuente
            textView.setTextColor(getColor(R.color.nuevo_color)) // Reemplaza "nuevo_color" con el color que desees.

            // Cambiar el fondo
            textView.setBackgroundResource(R.drawable.seivicodemapeo) // Reemplaza "nuevo_fondo" con el recurso de fondo que desees.

            // Cambiar la familia de fuente
            textView.typeface = Typeface.create("sans-serif-condensed", Typeface.NORMAL) // Reemplaza "sans-serif-condensed" con la familia de fuente que desees.

            // Cambiar el tamaño de fuente
            textView.textSize = 24f // Reemplaza 24 con el tamaño de fuente que desees.
        }
    }
}