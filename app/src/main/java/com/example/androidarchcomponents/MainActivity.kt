package com.example.androidarchcomponents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.androidarchcomponents.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var mainBinding: ActivityMainBinding
    private lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        mainViewModel = ViewModelProvider(this,MainViewModelFactory(10))[MainViewModel::class.java]
        setContentView(mainBinding.root)
        lifecycle.addObserver(Observer())

        incCount()
        mainViewModel.count.observe(this){
            mainBinding.textView.text = "" + mainViewModel.count.value
        }

    }

    private fun incCount() {
        mainBinding.buttonInc.setOnClickListener {
            mainViewModel.inc()
        }
    }

    override fun onDestroy() {
        Log.e("Main", "Activity OnDestroy called")
        super.onDestroy()
    }
}