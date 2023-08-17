package com.example.mangasosical.ui.news

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mangasosical.R
import com.example.mangasosical.base.BaseFragment
import com.example.mangasosical.base.BaseViewModel
import com.example.mangasosical.databinding.FragmentNewsBinding
import com.example.mangasosical.ui.news.adapter.NewsAdapter

class NewsFragment : BaseFragment<FragmentNewsBinding>(FragmentNewsBinding::inflate) {
    private val adapter by lazy { NewsAdapter() }
    override val viewModel: BaseViewModel
        get() = BaseViewModel()

    override fun initData() {
        
    }

    override fun handleEvent() {
        
    }

    override fun bindData() {
        binding.apply {
            recycelvNews.adapter = adapter
        }
    }

}