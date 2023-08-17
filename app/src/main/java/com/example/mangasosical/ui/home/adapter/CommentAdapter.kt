package com.example.mangasosical.ui.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mangasosical.databinding.ItemCommentHomeBinding
import com.example.mangasosical.databinding.ItemGenresBinding

class CommentAdapter : RecyclerView.Adapter<CommentAdapter.ViewHolder>() {
    class ViewHolder(val binding: ItemCommentHomeBinding): RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemCommentHomeBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int = 5

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    }
}