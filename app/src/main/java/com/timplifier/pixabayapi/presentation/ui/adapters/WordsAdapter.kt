package com.timplifier.pixabayapi.presentation.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.timplifier.pixabayapi.databinding.WordsHolderBinding
import com.timplifier.pixabayapi.domain.models.WordModel

class WordsAdapter(
    private var list: List<WordModel>
) :
    RecyclerView.Adapter<WordsAdapter.WordsHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordsAdapter.WordsHolder {
        return WordsHolder(
            WordsHolderBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    fun setList(list: List<WordModel>): List<WordModel> {
        return list

    }

    override fun onBindViewHolder(holder: WordsAdapter.WordsHolder, position: Int) {
        holder.onBind(list.get(position))
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