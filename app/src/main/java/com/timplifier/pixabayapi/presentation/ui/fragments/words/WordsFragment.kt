package com.timplifier.pixabayapi.presentation.ui.fragments.words

import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.timplifier.pixabayapi.R
import com.timplifier.pixabayapi.databinding.FragmentWordsBinding
import com.timplifier.pixabayapi.presentation.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class WordsFragment(private val wordsFragmentArgs: WordsFragmentArgs) :
    BaseFragment<FragmentWordsBinding>(
        R.layout.fragment_words
    ) {
    override val binding by viewBinding(FragmentWordsBinding::bind)
    private val viewModel: WordsViewModel by viewModels()


    override fun setupListeners() = with(binding) {
        super.setupListeners()
        btnAddWord.setOnClickListener(View.OnClickListener {
            CreateWordBottomSheetFragment().show(
                requireActivity().supportFragmentManager,
                "word dialog opened"
            )

        })

    }

    override fun getArgs() = with(binding) {
        super.getArgs()
        if (arguments != null) {
            var category = wordsFragmentArgs.category
            toolbar.title = category

        }
    }

    override suspend fun setupObserver() = with(binding) {
        super.setupObserver()
        var category = wordsFragmentArgs.category
        viewModel.getWords(category).observe(viewLifecycleOwner) { words ->
            recyclerview.adapter = WordsAdapter(words)


        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding == null
    }


}