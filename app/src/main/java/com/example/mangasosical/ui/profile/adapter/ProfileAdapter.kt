package com.example.mangasosical.ui.profile.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mangasosical.databinding.ItemHomeBinding

private const val TAG = "HomeAdapter"

class ProfileAdapter(
) : RecyclerView.Adapter<ProfileAdapter.ViewHolder>() {
    private val storyAdapter by lazy { StoryAdapter() }

    class ViewHolder(val binding: ItemHomeBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemHomeBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = 4

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.e(TAG, "onBindViewHolder: $position")
        holder.binding.recycleview.adapter = storyAdapter
    }

}