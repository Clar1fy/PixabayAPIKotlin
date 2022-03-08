package com.timplifier.pixabayapi.presentation.ui.fragments.words

import android.os.Bundle
import android.os.Handler
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.timplifier.pixabayapi.databinding.FragmentCreateWordBottomSheetBinding


class CreateWordBottomSheetFragment(
    private var handler: Handler?

) : BottomSheetDialogFragment() {
    private lateinit var binding: FragmentCreateWordBottomSheetBinding
    private val viewModel: WordsViewModel by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCreateWordBottomSheetBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupListeners()
        setupAdapter()
        getArgs()
    }

    private fun getArgs() {
        if (arguments != null)


    }

    private fun setupAdapter() {
        TODO("Not yet implemented")
    }

    private fun setupListeners() = with(binding) {
        etWord.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if (handler != null)
                    handler = null
            }

            override suspend fun afterTextChanged(p0: Editable?) {
                var word = etWord.text.toString()
                viewModel.getImages(word).observe(viewLifecycleOwner) { images ->
                    recyclerview.adapter =

                }
            }
        })
    }

}