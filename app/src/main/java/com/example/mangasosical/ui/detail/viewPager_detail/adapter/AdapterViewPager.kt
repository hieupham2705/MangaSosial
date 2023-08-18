package com.example.mangasosical.ui.detail.viewPager_detail.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.bumptech.glide.manager.Lifecycle
import com.example.mangasosical.ui.detail.viewPager_detail.ChapterFragment
import com.example.mangasosical.ui.detail.viewPager_detail.CommentFragment

class AdapterViewPager(
    fragmentManager: FragmentManager,
    lifecycle :androidx.lifecycle.Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 2;
    }

    override fun createFragment(position: Int): Fragment {
       return if (position == 0){
            ChapterFragment()
        }
        else{
            CommentFragment()
        }
    }
}