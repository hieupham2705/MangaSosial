package com.example.mangasosical.ui.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mangasosical.databinding.ItemComicBinding
import com.example.mangasosical.databinding.ItemHomeBinding

class StoryAdapter: RecyclerView.Adapter<StoryAdapter.ViewHolder>() {
    class ViewHolder(val binding: ItemComicBinding): RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemComicBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int = 20

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

}