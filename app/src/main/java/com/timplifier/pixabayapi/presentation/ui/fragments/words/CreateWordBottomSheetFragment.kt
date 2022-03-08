package com.timplifier.pixabayapi.presentation.ui.fragments.words

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.timplifier.pixabayapi.databinding.FragmentCreateWordBottomSheetBinding


class CreateWordBottomSheetFragment : BottomSheetDialogFragment() {
    private lateinit var binding: FragmentCreateWordBottomSheetBinding
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

    }

}