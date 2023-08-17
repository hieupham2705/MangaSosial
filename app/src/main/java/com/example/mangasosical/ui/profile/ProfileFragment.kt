package com.example.mangasosical.ui.profile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mangasosical.R
import com.example.mangasosical.base.BaseFragment
import com.example.mangasosical.base.BaseViewModel
import com.example.mangasosical.databinding.FragmentProfileBinding
import com.example.mangasosical.ui.profile.adapter.ProfileAdapter


class ProfileFragment : BaseFragment<FragmentProfileBinding>(FragmentProfileBinding::inflate) {
    private val profileAdapter by lazy { ProfileAdapter() }
    override val viewModel: BaseViewModel
        get() = BaseViewModel()

    override fun initData() {

    }

    override fun handleEvent() {

    }

    override fun bindData() {
        binding.recycleview.adapter = profileAdapter
    }

}