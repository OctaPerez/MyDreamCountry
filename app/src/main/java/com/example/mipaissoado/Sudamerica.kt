package com.example.mipaissoado

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_brasil.*

class Sudamerica : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sudamerica)

        val arrayAdapter1: ArrayAdapter<*>
        val paisessa = mutableListOf("Argentina","Bolivia", "Brasil", "Chile","Colombia","Ecuador", "Guyana",
                                    "Paraguay", "Perú", "Surinam", "Trinidad y Tobago", "Uruguay", "Venezuela")

        val PSudAm = findViewById<ListView>(R.id.PSudAm)

        arrayAdapter1 = ArrayAdapter(this, android.R.layout.simple_list_item_1, paisessa)
        PSudAm.adapter = arrayAdapter1
        PSudAm.setOnItemClickListener() { parent, view, position, id ->

            Toast.makeText(this, parent.getItemAtPosition(position).toString(), Toast.LENGTH_LONG).show()

            val intenta = Intent(this, Argentina::class.java)
            intenta.putExtra("Argentina", paisessa[position])
            startActivity(intenta)

            val intentb = Intent(this, Bolivia::class.java)
            intentb.putExtra("Bolivia", paisessa[position])
            startActivity(intentb)

            val intentbr = Intent(this, Brasil::class.java)
            intentbr.putExtra("Brasil", paisessa[position])
            startActivity(intentbr)


        }


    }
}