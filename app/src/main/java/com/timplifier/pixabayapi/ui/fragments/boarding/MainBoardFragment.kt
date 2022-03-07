package com.timplifier.pixabayapi.ui.fragments.boarding

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.timplifier.pixabayapi.R
import com.timplifier.pixabayapi.databinding.FragmentMainBoardBinding
import com.timplifier.pixabayapi.ui.base.BaseFragment


class MainBoardFragment : BaseFragment<FragmentMainBoardBinding>(
    R.layout.fragment_main_board
) {
    private val viewModel: OnBoardViewModel by viewModels()

    override fun setupListeners() {
        super.setupListeners()

    }

    override fun setupAdapter() {
        super.setupAdapter()
    }


}