package com.timplifier.pixabayapi.presentation.ui.fragments.boarding

import androidx.lifecycle.ViewModel
import com.timplifier.pixabayapi.data.local.PreferencesHelper
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class OnBoardViewModel @Inject constructor(
    private val preferencesHelper: PreferencesHelper
) : ViewModel() {
    fun setBoolean(isShown: Boolean) {
        preferencesHelper.setBoolean(isShown)
    }


    fun getBoolean(): Boolean {
        return preferencesHelper.getBoolean()
    }

}