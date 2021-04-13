package com.stock.ant.view

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.stock.ant.R
import com.stock.ant.base.BaseActivity
import com.stock.ant.databinding.ActivityLoginBinding
import com.stock.ant.databinding.ActivityMainBinding
import com.stock.ant.viewModel.LoginViewModel
import com.stock.ant.viewModel.MainViewModel

class MainActivity : BaseActivity<ActivityMainBinding,MainViewModel>() {
    override lateinit var binding: ActivityMainBinding
    override val viewModel = MainViewModel()
    override val layoutRes: Int
        get() = R.layout.activity_main

    override fun init() {
        val actionBar = supportActionBar
        actionBar?.hide()

        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController
        navView.setupWithNavController(navController)
    }

    override fun observerViewModel() {
    }
}