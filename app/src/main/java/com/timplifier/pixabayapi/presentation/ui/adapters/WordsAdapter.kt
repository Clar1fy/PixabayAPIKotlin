package com.timplifier.pixabayapi.presentation.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.timplifier.pixabayapi.databinding.WordsHolderBinding
import com.timplifier.pixabayapi.domain.models.WordModel

class WordsAdapter :
    RecyclerView.Adapter<WordsAdapter.WordsHolder>() {
    private var list = ArrayList<WordModel>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordsAdapter.WordsHolder {
        return WordsHolder(
            WordsHolderBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    fun setList(list: List<WordModel>) {
        this.list.addAll(list)
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: WordsAdapter.WordsHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class WordsHolder(
        private val binding: WordsHolderBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(wordModel: WordModel) = with(binding) {
            tvWords.text = wordModel.word
            imWords.setImageResource(wordModel.image)

        }


    }
}