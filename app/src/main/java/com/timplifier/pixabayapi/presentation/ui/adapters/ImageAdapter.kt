package com.timplifier.pixabayapi.presentation.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.timplifier.pixabayapi.data.remote.hits.PixabayHits
import com.timplifier.pixabayapi.databinding.ItemImageBinding

class ImageAdapter(
    private var list: List<PixabayHits>
) : RecyclerView.Adapter<ImageAdapter.ImageHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageHolder {
        return ImageHolder(
            ItemImageBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ImageHolder, position: Int) {
        holder.onBind(list.get(position))

    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class ImageHolder(private val binding: ItemImageBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(hits: PixabayHits) = with(binding) {
            Glide.with(imImage).load(hits.largeImageURL).into(imImage)

        }

    }

}