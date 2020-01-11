package com.example.cardpicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var card01:Card = Card("spade",10)
        var card02:Card = Card("heart",4)
        var card03:Card = Card("clover",7)
        var card04:Card = Card("diamond",2)
    }
}