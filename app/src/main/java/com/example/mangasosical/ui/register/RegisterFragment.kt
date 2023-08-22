package com.example.mangasosical.ui.register

import android.widget.Toast
import androidx.lifecycle.ViewModel
import com.example.mangasosical.base.BaseFragment
import com.example.mangasosical.base.BaseViewModel
import com.example.mangasosical.data.service.ApiService
import com.example.mangasosical.databinding.FragmentRegisterBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class RegisterFragment : BaseFragment<FragmentRegisterBinding>(FragmentRegisterBinding::inflate) {
     override val viewModel by viewModel<RegisterViewModel>()
    private val mviewModel: BaseViewModel
        get() = BaseViewModel()
    override fun initData() {
        viewModel.apply {

        }
    }

    override fun handleEvent() {

    }

    override fun bindData() {
        binding.apply {
            btnLogIn.setOnClickListener{
                val email = binding.edtEdtEmail.editText.toString()
                val password = binding.edtPassword.editText.toString();
                if (email.isEmpty() || password.isEmpty()){
                    Toast.makeText(context,"Không được bổ trống",Toast.LENGTH_LONG).show()
                }
                else {
                    // đoạn này là phần call
                    viewModel.CallApiRegister(email,password)
                }
            }
        }
    }


}