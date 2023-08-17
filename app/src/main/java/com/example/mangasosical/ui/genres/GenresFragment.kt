package com.example.mangasosical.ui.genres
import com.example.mangasosical.base.BaseFragment
import com.example.mangasosical.base.BaseViewModel
import com.example.mangasosical.databinding.FragmentGenresBinding
import com.example.mangasosical.ui.genres.adapter.BannerGenresAdapter
import com.example.mangasosical.ui.genres.adapter.GenresAdapter


class GenresFragment : BaseFragment<FragmentGenresBinding>(FragmentGenresBinding::inflate) {
    private val adapterBanner by lazy { BannerGenresAdapter() }
    private val adapterGenres by lazy { GenresAdapter() }
    override val viewModel: BaseViewModel
        get() = BaseViewModel()

    override fun initData() {
        
    }

    override fun handleEvent() {
        
    }

    override fun bindData() {
        binding.apply {
            recycleviewBanner.adapter = adapterBanner
            recycelviewGenres.adapter = adapterGenres
        }
    }

}