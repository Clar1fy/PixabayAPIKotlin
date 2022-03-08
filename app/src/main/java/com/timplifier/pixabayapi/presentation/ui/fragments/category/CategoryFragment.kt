package com.timplifier.pixabayapi.presentation.ui.fragments.category

import by.kirich1409.viewbindingdelegate.viewBinding
import com.timplifier.pixabayapi.R
import com.timplifier.pixabayapi.databinding.FragmentCategoryBinding
import com.timplifier.pixabayapi.presentation.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CategoryFragment :
    BaseFragment<FragmentCategoryBinding>(
        R.layout.fragment_category
    ) {
    override val binding by viewBinding(FragmentCategoryBinding::bind)

    override fun onDestroyView() {
        super.onDestroyView()
        binding == null
    }

}