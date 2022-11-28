package com.example.coinflip

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val m18: Button = findViewById(R.id.b18)

        m18.setOnClickListener { rolltime() }
    }

    fun rolltime() {
        val rand = Random()
        val runRandom = rand.roll()
        val m18: ImageView = findViewById(R.id.m18)

        val mView = when (runRandom) {
            1 -> R.drawable.sr
            else -> R.drawable.srr
        }
        m18.setImageResource(mView)
        m18.contentDescription = runRandom.toString()

    }

}

class Random() {

    fun roll(): Int {
        return (1..2).random()
    }
}