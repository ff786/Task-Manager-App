package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class CreateNew : AppCompatActivity() {

    private lateinit var dbHelper: DBHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.create_new)

        dbHelper = DBHelper(this, null)

        val createBtn: Button = findViewById(R.id.createBtn)
        createBtn.setOnClickListener {
            val name = R.id.RName.toString()
            val description = R.id.Description.toString()

            dbHelper.addName(name, description)

            Toast.makeText(this, "$name added to database", Toast.LENGTH_LONG).show()

            /*R.id.RName.toString().clear()
            R.id.Description.clear()*/
        }

        /*printName.setOnClickListener {
            val cursor = dbHelper.getName()

            Name.text = ""
            Description.text = ""

            cursor?.apply {
                while (moveToNext()) {
                    Attributes.Name.append(getString(getColumnIndex(DBHelper.RECEIVER_NAME)) + "\n")
                    Description.append(getString(getColumnIndex(DBHelper.DESCRIPTION)) + "\n")
                }
                close()
            }
        }*/
    }

}

