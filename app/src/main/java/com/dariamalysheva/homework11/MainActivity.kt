package com.dariamalysheva.homework11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_greet.setOnClickListener {
            val name = et_name.text.toString()
            val surname = et_surname.text.toString()
            Toast.makeText(this, "Hello, $name $surname!", Toast.LENGTH_LONG).show()
        }
    }
}