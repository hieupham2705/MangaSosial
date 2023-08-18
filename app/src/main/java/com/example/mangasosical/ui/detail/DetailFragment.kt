package com.example.mangasosical.ui.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.mangasosical.R
import com.example.mangasosical.base.BaseFragment
import com.example.mangasosical.base.BaseViewModel
import com.example.mangasosical.databinding.FragmentDetailBinding
import com.example.mangasosical.ui.detail.viewPager_detail.adapter.AdapterViewPager
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener

class DetailFragment : BaseFragment<FragmentDetailBinding>(FragmentDetailBinding::inflate) {
    private lateinit var adapter : AdapterViewPager
    override val viewModel: BaseViewModel
        get() = BaseViewModel()

    override fun initData() {
        TODO("Not yet implemented")
    }

    override fun handleEvent() {
        TODO("Not yet implemented")
    }

    override fun bindData() {
        binding.apply {
            tablayout.addTab(tablayout.newTab().setText("Chapter"))
            tablayout.addTab(tablayout.newTab().setText("Comment"))
            viewpager2.adapter = adapter;
            tablayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
                override fun onTabSelected(tab: TabLayout.Tab?) {
                    if (tab != null){
                        viewpager2.currentItem = tab.position
                    }
                }

                override fun onTabUnselected(tab: TabLayout.Tab?) {
                    TODO("Not yet implemented")
                }

                override fun onTabReselected(tab: TabLayout.Tab?) {
                    TODO("Not yet implemented")
                }

            })
            viewpager2.registerOnPageChangeCallback(object  : ViewPager2.OnPageChangeCallback(){
                override fun onPageSelected(position: Int) {
                    super.onPageSelected(position)
                    tablayout.selectTab(tablayout.getTabAt(position))
                }
            })
        }
    }

}