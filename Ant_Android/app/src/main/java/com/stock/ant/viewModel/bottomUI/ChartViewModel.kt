package com.stock.ant.viewModel.bottomUI

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ChartViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "이곳은 그래프 화면 두둥탁"
    }
    val text: LiveData<String> = _text
}