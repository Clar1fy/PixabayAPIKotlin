package com.timplifier.pixabayapi.presentation.ui.fragments.words

import by.kirich1409.viewbindingdelegate.viewBinding
import com.timplifier.pixabayapi.R
import com.timplifier.pixabayapi.databinding.FragmentWordsBinding
import com.timplifier.pixabayapi.presentation.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class WordsFragment :
    BaseFragment<FragmentWordsBinding>(
        R.layout.fragment_words
    ) {
    override val binding by viewBinding(FragmentWordsBinding::bind)
    override fun onDestroyView() {
        super.onDestroyView()
        binding == null
    }


}