package com.timplifier.pixabayapi.presentation.ui.fragments.category

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.timplifier.pixabayapi.databinding.FragmentCreateCategoryBottomSheetBinding


class CreateCategoryBottomSheetFragment : BottomSheetDialogFragment() {
    private lateinit var binding: FragmentCreateCategoryBottomSheetBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCreateCategoryBottomSheetBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}