package com.example.rodrigo.escolaappmobile

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.rodrigo.escolaappmobile.R
import kotlinx.android.synthetic.main.activity_main.*

class DiaSelecionado : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dia_selecionado)

        val textView = findViewById<TextView>(R.id.diaSelecionado)
        textView.setText(getIntent().getStringExtra("data"))

    }
}
