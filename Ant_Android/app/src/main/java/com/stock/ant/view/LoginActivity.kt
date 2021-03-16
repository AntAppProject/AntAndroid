package com.stock.ant.view


import com.stock.ant.R
import com.stock.ant.base.BaseActivity
import com.stock.ant.databinding.ActivityLoginBinding
import com.stock.ant.viewModel.LoginViewModel

class LoginActivity : BaseActivity<ActivityLoginBinding, LoginViewModel>() {
    override lateinit var binding: ActivityLoginBinding

    override val viewModel = LoginViewModel()

    override val layoutRes: Int
        get() = R.layout.activity_login


    override fun init() {

    }

    override fun observerViewModel() {

    }

}