package com.example.mangasosical.ui.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mangasosical.databinding.ItemSlideShowBinding
import com.example.mangasosical.model.Slide

class SlideShowAdapter : RecyclerView.Adapter<SlideShowAdapter.ViewHolder>(){
    private val listSlide = mutableListOf<Slide>()
    class ViewHolder(val binding : ItemSlideShowBinding): RecyclerView.ViewHolder(binding.root) {
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemSlideShowBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int = 20

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        
    }

    fun setListSlide(list : List<Slide>){
        listSlide.clear()
        listSlide.addAll(list)
        notifyDataSetChanged()
    }
}