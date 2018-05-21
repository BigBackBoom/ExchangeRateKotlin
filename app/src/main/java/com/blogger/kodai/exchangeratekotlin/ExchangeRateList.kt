package com.blogger.kodai.exchangeratekotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log

class ExchangeRateList : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d("ExchangeRateList", "onCreate")

        //added comment
        setContentView(R.layout.activity_exchange_rate_list)
    }

    override fun onStart() {
        super.onStart()
        Log.d("ExchangeRateList", "onStart")
    }

    override fun onResume() {
        super.onResume()

        Log.d("ExchangeRateList", "onResume")

    }

    override fun onRestart() {
        super.onRestart()

        Log.d("ExchangeRateList", "onRestart")

    }

    override fun onPause() {
        super.onPause()

        Log.d("ExchangeRateList", "onPause")
    }

    override fun onStop() {
        super.onStop()

        Log.d("ExchangeRateList", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("ExchangeRateList", "onDestroy")
    }
}
