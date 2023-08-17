package com.example.mangasosical.ui.genres.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mangasosical.databinding.ItemBannerGenresBinding
import com.example.mangasosical.databinding.ItemGenresBinding

class GenresAdapter : RecyclerView.Adapter<GenresAdapter.VewiHolder>() {
    class VewiHolder(val binding: ItemGenresBinding) : RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VewiHolder {
        return VewiHolder(ItemGenresBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int = 20

    override fun onBindViewHolder(holder: VewiHolder, position: Int) {
    }
}