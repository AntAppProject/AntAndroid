package com.stock.ant.viewModel.bottomUI

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "메인화면"
    }
    val text: LiveData<String> = _text
}