package com.example.androidarchcomponents

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

class Observer : DefaultLifecycleObserver {
    override fun onCreate(owner: LifecycleOwner) {
        Log.e("MAIN", "OnCreate called")
        super.onCreate(owner)
    }

    override fun onDestroy(owner: LifecycleOwner) {
        Log.e("MAIN", "OnDestroy called")
        super.onDestroy(owner)
    }
}