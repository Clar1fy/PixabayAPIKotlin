package com.timplifier.pixabayapi.data.local

import android.content.SharedPreferences
import javax.inject.Inject

class PreferencesHelper @Inject constructor(
    private val sharedPreferences: SharedPreferences
) {

    fun setBoolean(isShown: Boolean) {
        sharedPreferences.edit().putBoolean("shared_preferences", isShown).apply()
    }

    fun getBoolean(): Boolean {
        return sharedPreferences.getBoolean("shared_preferences", false)

    }

}