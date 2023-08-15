package com.example.mangasosical.di

import com.example.mangasosical.ui.home.HomeViewModel
import com.example.mangasosical.ui.register.RegisterViewModel
import com.example.mangasosical.ui.signin.SigInViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { SigInViewModel() }
    viewModel { RegisterViewModel() }
    viewModel { HomeViewModel() }
}