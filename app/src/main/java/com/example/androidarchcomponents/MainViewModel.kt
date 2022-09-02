package com.example.androidarchcomponents

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel(private val initialValue:Int) : ViewModel() {
    var count: MutableLiveData<Int> = MutableLiveData<Int>(initialValue)

    fun inc() {
        count.value = count.value?.plus(1)
    }
}