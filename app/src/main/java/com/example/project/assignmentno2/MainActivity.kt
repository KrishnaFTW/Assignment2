package com.example.project.assignmentno2


import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find views by ID
        textView = findViewById(R.id.textView)
        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)

        // Button 1: Change text of the TextView
        button1.setOnClickListener {
            textView.text = "Text Changed!"
        }

        // Button 2: Change the height of the TextView
        button2.setOnClickListener {
            val params = textView.layoutParams
            params.height = 200 // Set height in pixels
            textView.layoutParams = params
        }

        // Button 3: Bring the TextView to the center of the screen
        button3.setOnClickListener {
            val params = textView.layoutParams as LinearLayout.LayoutParams
            params.gravity = Gravity.CENTER
            textView.layoutParams = params
        }
    }
}

