package com.timplifier.pixabayapi.presentation.ui.fragments.category

import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.timplifier.pixabayapi.R
import com.timplifier.pixabayapi.databinding.FragmentCategoryBinding
import com.timplifier.pixabayapi.presentation.base.BaseFragment
import com.timplifier.pixabayapi.presentation.ui.adapters.CategoryAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class CategoryFragment :
    BaseFragment<FragmentCategoryBinding>(
        R.layout.fragment_category
    ) {
    override val binding by viewBinding(FragmentCategoryBinding::bind)
    private val viewModel: CategoryViewModel by viewModels()
    private val adapter = CategoryAdapter(this::onCategoryClickListener)
    override fun setupAdapter() = with(binding) {
        recyclerview.adapter = adapter

    }

    override fun setupListeners() = with(binding) {
        btnAddCategory.setOnClickListener {
            findNavController().navigate(R.id.createCategoryBottomSheetFragment)
        }


    }

    override fun setupObserver() {
        viewLifecycleOwner.lifecycleScope.launch {
            viewModel.getCategories().observe(viewLifecycleOwner) { categories ->
                adapter.setList(categories)


            }
        }
    }

    private fun onCategoryClickListener(category: String, position: Int) {
        findNavController().navigate(
            CategoryFragmentDirections.actionCategoryFragmentToWordsFragment(
                category
            )
        )


    }

}