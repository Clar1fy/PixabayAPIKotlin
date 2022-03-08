package com.timplifier.pixabayapi.presentation.base

import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<Binding : ViewBinding>(
    @LayoutRes layoutId: Int
) : Fragment(layoutId) {

    private var _binding: Binding? = null
    val binding: Binding
        get() = _binding as Binding


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupListeners()
        setupAdapter()
        setupObserver()
        setupArgs()
        getArgs()
        enable()
        check()

    }

    open fun check() {
    }

    open fun setupArgs() {
    }

    open fun getArgs() {
    }

    open fun setupAdapter() {

    }

    open fun setupObserver() {

    }

    open fun setupListeners() {

    }

    open fun enable() {

    }


}