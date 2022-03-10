package com.timplifier.pixabayapi.presentation.ui.fragments.words

import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import com.timplifier.pixabayapi.R
import com.timplifier.pixabayapi.databinding.FragmentWordsBinding
import com.timplifier.pixabayapi.presentation.base.BaseFragment
import com.timplifier.pixabayapi.presentation.ui.adapters.WordsAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class WordsFragment(private val wordsFragmentArgs: WordsFragmentArgs) :
    BaseFragment<FragmentWordsBinding>(
        R.layout.fragment_words
    ) {

    override val binding by viewBinding(FragmentWordsBinding::bind)
    private val viewModel: WordsViewModel by viewModels()
    private val args: WordsFragmentArgs by navArgs()


    override fun setupListeners() = with(binding) {
        btnAddWord.setOnClickListener {
            CreateWordBottomSheetFragment().show(
                requireActivity().supportFragmentManager,
                "word dialog opened"
            )

        }


    }

    override fun getArgs() = with(binding) {
        toolbar.title = args.category
    }

    override fun setupObserver() {
        lifecycleScope.launch {
            viewModel.getWords(args.category).observe(viewLifecycleOwner) { words ->
                binding.recyclerview.adapter = WordsAdapter(words)
            }

        }
    }


}