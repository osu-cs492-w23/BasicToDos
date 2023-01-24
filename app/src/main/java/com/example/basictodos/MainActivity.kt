package com.example.basictodos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val todoListTV: TextView = findViewById(R.id.tv_todo_list)
        val todoEntryET: EditText = findViewById(R.id.et_todo_entry)
        val addTodoBtn: Button = findViewById(R.id.btn_add_todo)

        val todoList = mutableListOf<String>()

//        todoListTV.text = "Finish my to-do app"

        addTodoBtn.setOnClickListener {
            val todoText = todoEntryET.text.toString()
            if (!TextUtils.isEmpty(todoText)) {
//                todoListTV.text = todoText
                todoList.add(0, todoText)

                todoListTV.text = todoList.joinToString(separator = "\n\n")

                todoEntryET.setText("")
            }
        }
    }
}