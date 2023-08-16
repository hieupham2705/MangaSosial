package com.example.mangasosical.ui.home

import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.core.view.size
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.CompositePageTransformer
import androidx.viewpager2.widget.MarginPageTransformer
import androidx.viewpager2.widget.ViewPager2
import com.example.mangasosical.base.BaseFragment
import com.example.mangasosical.base.BaseViewModel
import com.example.mangasosical.databinding.FragmentHomeBinding
import com.example.mangasosical.ui.home.adapter.HomeAdapter
import com.example.mangasosical.ui.home.adapter.SlideShowAdapter
import java.lang.Math.abs


class HomeFragment : BaseFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate) {
    private val slideShowAdapter by lazy { SlideShowAdapter() }
    private val homeAdapter by lazy { HomeAdapter() }
    override val viewModel: BaseViewModel
        get() = BaseViewModel()

    override fun initData() {

    }

    override fun handleEvent() {

    }

    override fun bindData() {
        binding.apply {
            viewpager2Slide.adapter = slideShowAdapter
            viewpager2Slide.clipToPadding = false
            viewpager2Slide.clipChildren = false
            viewpager2Slide.offscreenPageLimit = 3
            viewpager2Slide.getChildAt(0).overScrollMode = RecyclerView.OVER_SCROLL_ALWAYS
            val comPosPagetarn = CompositePageTransformer()
            comPosPagetarn.addTransformer(MarginPageTransformer(40))
            comPosPagetarn.addTransformer { page, position ->
                val r: Float = 1 - abs(position)
                page.scaleY = 0.85f + r * 0.15f
            }
            val sliderRun = Runnable {
                if (binding.viewpager2Slide.currentItem == binding.viewpager2Slide.size - 1)
                    binding.viewpager2Slide.currentItem = 0
                viewpager2Slide.currentItem = viewpager2Slide.currentItem + 1
            }
            viewpager2Slide.setPageTransformer(comPosPagetarn)
            viewpager2Slide.registerOnPageChangeCallback(
                object : ViewPager2.OnPageChangeCallback() {
                    override fun onPageSelected(position: Int) {
                        super.onPageSelected(position)
                        Handler().removeCallbacks(sliderRun)
                        Handler().postDelayed(sliderRun, 5000)
                    }
                }
            )
            recycleview.adapter = homeAdapter
        }
    }

    override fun onPause() {
        super.onPause()
        val sliderRun = Runnable {
            if (binding.viewpager2Slide.currentItem == binding.viewpager2Slide.size - 1)
                binding.viewpager2Slide.currentItem = 0
            binding.viewpager2Slide.currentItem = binding.viewpager2Slide.currentItem + 1
        }
        Handler().removeCallbacks(sliderRun)
        Handler().postDelayed(sliderRun, 5000)
    }

}