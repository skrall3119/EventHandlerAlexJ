package com.ebookfrenzy.eventexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myButton.setOnClickListener{
            statusText.text = "Button Clicked"
        }

        myButton.setOnLongClickListener{
            statusText.text = "long button Click"
            false
        }
    }
}
