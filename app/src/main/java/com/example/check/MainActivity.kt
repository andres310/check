package com.example.check

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        // Recupera componentes
        val check = findViewById<CheckBox>(R.id.my_checkBox)
        val btn = findViewById<Button>(R.id.my_button)

        // default btn invisible
        check.isChecked = true

        // Evento
        check.setOnCheckedChangeListener { buttonView, isChecked ->
            // Si esta checked
            if (isChecked)
                // mostrar el btn
                btn.visibility = View.VISIBLE
            else
                // siino ocultarlo
                btn.visibility = View.INVISIBLE
        }
    }
}