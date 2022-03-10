package com.timplifier.pixabayapi.presentation.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.timplifier.pixabayapi.databinding.CategoriesHolderBinding
import com.timplifier.pixabayapi.domain.models.CategoryModel

class CategoryAdapter(
    val onCategoryClickListener: (category: String, position: Int) -> Unit
) : RecyclerView.Adapter<CategoryAdapter.CategoryHolder>() {
    private var list = ArrayList<CategoryModel>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryHolder {
        return CategoryHolder(
            CategoriesHolderBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    }

    fun setList(list: List<CategoryModel>) {
        this.list.addAll(list)
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: CategoryHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class CategoryHolder(private val binding: CategoriesHolderBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(categoryModel: CategoryModel) = with(binding) {
            tvCard.text = categoryModel.title
            binding.root.setOnClickListener {
                onCategoryClickListener(categoryModel.title, absoluteAdapterPosition)


            }


        }

    }

}