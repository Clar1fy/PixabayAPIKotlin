package com.timplifier.pixabayapi.presentation.ui.fragments

import com.timplifier.pixabayapi.R
import com.timplifier.pixabayapi.databinding.FragmentSearchImagesBinding
import com.timplifier.pixabayapi.presentation.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SearchImagesFragment(override val binding: FragmentSearchImagesBinding) :
    BaseFragment<FragmentSearchImagesBinding>(
        R.layout.fragment_search_images
    ) {

    override fun onDestroyView() {
        super.onDestroyView()
        binding == null
    }


}