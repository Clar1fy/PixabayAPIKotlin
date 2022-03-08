package com.timplifier.pixabayapi.presentation.ui.fragments

import android.os.Bundle
import android.view.View
import com.timplifier.pixabayapi.R
import com.timplifier.pixabayapi.databinding.FragmentSearchImagesBinding
import com.timplifier.pixabayapi.presentation.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SearchImagesFragment : BaseFragment<FragmentSearchImagesBinding>(
    R.layout.fragment_search_images
) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }


}