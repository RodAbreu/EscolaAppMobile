package com.example.rodrigo.escolaappmobile
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView
import com.example.rodrigo.escolaappmobile.R
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        val buttonLogin = findViewById<Button>(R.id.login)

        val datePicker = findViewById<DatePicker>(R.id.datePicker)
        val today = Calendar.getInstance()
        datePicker.init(today.get(Calendar.YEAR), today.get(Calendar.MONTH), today.get(Calendar.DAY_OF_MONTH)

        ) { view, year, monthOfYear, dayOfMonth ->
            val month = monthOfYear + 1
            val msg = "Eventos do dia $dayOfMonth/$month/$year"

            if (textView != null) {
                textView.text = msg
            }
        }


        //apresenta por escrito a data que o usuario digitou
        textView.setOnClickListener(){
            val intent = Intent(this, DiaSelecionado::class.java)

            val dados = Bundle()


            val data = "Data: ${datePicker.dayOfMonth}/${datePicker.month}/${datePicker.year}"

            dados.putString("data", data)
            intent.putExtras(dados)
            startActivity(intent)
        }

        //botão de login
        buttonLogin.setOnClickListener(){
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

    }

}


