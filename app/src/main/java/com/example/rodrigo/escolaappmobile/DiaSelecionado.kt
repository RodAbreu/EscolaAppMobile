package com.example.rodrigo.escolaappmobile

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import com.example.rodrigo.escolaappmobile.R
import kotlinx.android.synthetic.main.activity_main.*

class DiaSelecionado : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dia_selecionado)

        //apresenta a data selecionada
        val textView = findViewById<TextView>(R.id.diaSelecionado)
        textView.setText(getIntent().getStringExtra("data"))

        //apresenta a lista de atividades naquele dia
        val listView = findViewById<ListView>(R.id.listaDeAtividades)

        var listItems: MutableList<String> = mutableListOf()
        listItems.add("Fechamento do portão às 18 horas")
        listItems.add("Reunião de pais às 19 horas")

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listItems)
        listView.adapter = adapter

    }
}
