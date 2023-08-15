package com.example.mangasosical.ui

import androidx.core.view.isVisible
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.example.mangasosical.R
import com.example.mangasosical.base.BaseActivity
import com.example.mangasosical.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate) {
    private val navController by lazy { findNavController(R.id.nav_host_fragment_activity_main) }
    override fun initData() {

    }

    override fun handleEvent() {

    }

    override fun bindData() {
        setupWithNavController(binding.navView, navController)
        navController.addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id) {
                R.id.homeFragment -> {
                    setNavigationVisible(true)
                }R.id.profileFragment -> {
                    setNavigationVisible(true)
                }R.id.newsFragment -> {
                    setNavigationVisible(true)
                }R.id.genresFragment -> {
                    setNavigationVisible(true)
                }
                else -> {
                    setNavigationVisible()
                }
            }
        }
    }

    private fun setNavigationVisible(
        isVisiblenavView: Boolean = false
    ) {
        binding.navView.isVisible = isVisiblenavView
    }
}