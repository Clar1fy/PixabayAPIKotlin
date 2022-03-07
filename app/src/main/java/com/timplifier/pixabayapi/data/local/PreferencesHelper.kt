package com.timplifier.pixabayapi.data.local

import android.content.SharedPreferences

class PreferencesHelper(
    private val sharedPreferences: SharedPreferences
) {

    fun setBoolean(isShown: Boolean) {
        sharedPreferences.edit().putBoolean("shared_preferences", isShown).apply()
    }

    fun getBoolean(): Boolean {
        var isShown: Boolean = sharedPreferences.getBoolean("shared_preferences", false)
        return isShown

    }

}