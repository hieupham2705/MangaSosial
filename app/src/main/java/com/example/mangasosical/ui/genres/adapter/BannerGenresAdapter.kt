package com.example.mangasosical.ui.genres.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mangasosical.databinding.ItemBannerGenresBinding

class BannerGenresAdapter() : RecyclerView.Adapter<BannerGenresAdapter.ViewHolder>(){
    class  ViewHolder(val binding: ItemBannerGenresBinding) : RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemBannerGenresBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int = 20

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }
}