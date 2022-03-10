package com.timplifier.pixabayapi.presentation.ui.fragments.words

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.timplifier.pixabayapi.databinding.FragmentCreateWordBottomSheetBinding
import com.timplifier.pixabayapi.presentation.ui.adapters.ImageAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class CreateWordBottomSheetFragment : BottomSheetDialogFragment() {

    private lateinit var binding: FragmentCreateWordBottomSheetBinding
    private val adapter = ImageAdapter()
    private val viewModel: WordsViewModel by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCreateWordBottomSheetBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupListeners()
        setupAdapter()
    }


    private fun setupAdapter() {
        binding.recyclerview.adapter = adapter

    }

    private fun setupListeners() = with(binding) {
        etWord.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun afterTextChanged(p0: Editable?) {
                viewLifecycleOwner.lifecycleScope.launch {
                    viewModel.getImages(p0.toString()).observe(viewLifecycleOwner) { images ->

                        adapter.setList(images)

                    }


                }
            }
        })
    }

}