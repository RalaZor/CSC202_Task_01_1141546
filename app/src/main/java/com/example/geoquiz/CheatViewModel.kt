package com.example.geoquiz

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModel

private const val TAG = "CheatViewModel"


class CheatViewModel : ViewModel() {
    init{
        Log.d(TAG, "ViewModel instance created")
    }

    override fun onCleared() {
        super.onCleared()
        Log.d(TAG, "ViewModel instance is about to be destroyed")
        }

    var Cheated = false


}

