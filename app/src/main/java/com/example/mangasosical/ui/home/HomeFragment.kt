package com.example.mangasosical.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mangasosical.R
import com.example.mangasosical.base.BaseFragment
import com.example.mangasosical.base.BaseViewModel
import com.example.mangasosical.databinding.FragmentHomeBinding
import org.koin.androidx.viewmodel.ext.android.viewModel


class HomeFragment : BaseFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate) {
    override val viewModel: BaseViewModel
        get() = BaseViewModel()

    override fun initData() {
        
    }

    override fun handleEvent() {
        
    }

    override fun bindData() {
        
    }

}