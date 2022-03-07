package com.timplifier.pixabayapi.presentation.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.timplifier.pixabayapi.databinding.FragmentBoardBinding
import com.timplifier.pixabayapi.domain.models.ViewPagerModel

class ViewPagerAdapter(
    var list: ArrayList<ViewPagerModel>
) : RecyclerView.Adapter<ViewPagerAdapter.ViewPagerHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerHolder {
        return ViewPagerHolder(
            FragmentBoardBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    }

    override fun onBindViewHolder(holder: ViewPagerHolder, position: Int) {
        holder.onBind(list.get(position))

    }

    override fun getItemCount(): Int {
        return list.size


    }

    inner class ViewPagerHolder(private val binding: FragmentBoardBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(viewPagerModel: ViewPagerModel) = with(binding) {
            imImage.setImageResource(viewPagerModel.image)
            tvLabel.text = viewPagerModel.title
            tvDesc.text = viewPagerModel.description
            root.setOnClickListener(View.OnClickListener {

            })

        }

    }

}