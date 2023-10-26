package com.tdam.onclicktext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class OnClickXML : AppCompatActivity() {

    private var contador = 0 //es un contador para el textview que se guarda con el estado de la actividad
    private lateinit var textView: TextView
    private lateinit var imageView: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_click_xml)

        textView = findViewById(R.id.textView)//seteamos el textview de la clase con el textview del layout
        imageView = findViewById<ImageView>(R.id.imageView1)

    }

    fun incrementarTexto(view: View) {
        contador++
        textView.text = contador.toString()
        imageView.setImageResource(R.drawable.fondo1_background)
    }

}