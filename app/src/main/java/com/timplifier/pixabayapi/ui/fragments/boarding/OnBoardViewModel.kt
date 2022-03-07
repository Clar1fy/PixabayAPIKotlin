package com.timplifier.pixabayapi.ui.fragments.boarding

import androidx.lifecycle.ViewModel
import com.timplifier.pixabayapi.data.local.PreferencesHelper
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class OnBoardViewModel @Inject constructor(
    preferencesHelper: PreferencesHelper
) : ViewModel() {
    fun setBoolean(preferencesHelper: PreferencesHelper, isShown: Boolean) {
        preferencesHelper.setBoolean(isShown)
    }


    fun getBoolean(preferencesHelper: PreferencesHelper): Boolean {
        return preferencesHelper.getBoolean()
    }

}