package com.example.alphabetbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnExit = findViewById<Button>(R.id.exit)
        btnExit.setOnClickListener {
            val builder = AlertDialog.Builder(this@MainActivity)
            builder.setTitle("Exit Application")
            builder.setMessage("Are you sure you want to exit?")
            builder.setPositiveButton("Yes") { dialogInterface, i -> finish() }
            builder.setNegativeButton("No") { dialogInterface, i -> dialogInterface.dismiss() }
            val dialog = builder.create()
            dialog.show()
        }
    }
}