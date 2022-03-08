package com.timplifier.pixabayapi.presentation.ui.fragments.boarding

import android.view.View
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import androidx.viewpager2.widget.ViewPager2
import by.kirich1409.viewbindingdelegate.viewBinding
import com.timplifier.pixabayapi.R
import com.timplifier.pixabayapi.data.local.client.ViewPagerClient
import com.timplifier.pixabayapi.databinding.FragmentMainBoardBinding
import com.timplifier.pixabayapi.presentation.base.BaseFragment
import com.timplifier.pixabayapi.presentation.ui.adapters.ViewPagerAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainBoardFragment :
    BaseFragment<FragmentMainBoardBinding>(
        R.layout.fragment_main_board
    ) {
    override val binding by viewBinding(FragmentMainBoardBinding::bind)
    private val viewModel: OnBoardViewModel by viewModels()

    override fun setupListeners() = with(binding) {
        super.setupListeners()
        btnGetStarted.setOnClickListener(View.OnClickListener {
            viewModel.setBoolean(true)
            Navigation.findNavController(requireView()).navigate(R.id.wordsFragment)
        })


    }

    override fun check() {
        super.check()
        if (viewModel.getBoolean())
            Navigation.findNavController(requireView()).navigate(R.id.categoryFragment)
    }

    override fun enable() = with(binding) {
        super.enable()
        viewpager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                if (position == 4) {
                    btnGetStarted.visibility = View.VISIBLE
                } else {
                    btnGetStarted.visibility = View.GONE
                }

            }
        })

    }

    override fun setupAdapter() {
        super.setupAdapter()
        val viewPagerClient = ViewPagerClient()
        val viewPagerAdapter = ViewPagerAdapter(viewPagerClient.getList(), this::onItemClick)
        binding.viewpager.adapter = viewPagerAdapter
        binding.dotsIndicator.setViewPager2(binding.viewpager)

    }

    private fun onItemClick(position: Int) {

    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding == null
    }


}