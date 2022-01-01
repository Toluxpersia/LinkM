package com.example.link.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.link.Greeting
import android.widget.TextView
import androidx.activity.compose.setContent
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            setContent{

        }
    }
}
