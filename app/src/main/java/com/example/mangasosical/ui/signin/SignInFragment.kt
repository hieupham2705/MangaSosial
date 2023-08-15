package com.example.mangasosical.ui.signin

import androidx.navigation.fragment.findNavController
import com.example.mangasosical.R
import com.example.mangasosical.base.BaseFragment
import com.example.mangasosical.base.BaseViewModel
import com.example.mangasosical.databinding.FragmentSignInBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class SignInFragment : BaseFragment<FragmentSignInBinding>(FragmentSignInBinding::inflate) {
    override val viewModel: BaseViewModel
        get() = BaseViewModel()

    override fun initData() {
        
    }

    override fun handleEvent() {
        binding.apply {
            btnLogIn.setOnClickListener {
                findNavController().navigate(R.id.action_signInFragment_to_registerFragment)
            }
        }
    }

    override fun bindData() {
        
    }

}