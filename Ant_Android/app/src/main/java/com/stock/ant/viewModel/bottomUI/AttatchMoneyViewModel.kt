package com.stock.ant.viewModel.bottomUI

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AttatchMoneyViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "계좌잔고"
    }
    val text: LiveData<String> = _text
}