package com.timplifier.pixabayapi.data.local.client

import com.timplifier.pixabayapi.R
import com.timplifier.pixabayapi.domain.models.ViewPagerModel

class ViewPagerClient {

    fun getList(): ArrayList<ViewPagerModel> {
        val list = ArrayList<ViewPagerModel>()
        list.add(
            ViewPagerModel(
                "Categories",
                "Create your own categories for words",
                R.drawable.ic_first_onboard
            )
        )
        list.add(
            ViewPagerModel(
                "Words",
                "Create words in English and click on the card to see the translation and image for associations",
                R.drawable.ic_second_onboard
            )
        )
        list.add(
            ViewPagerModel(
                "Learning",
                "Swipe the card either to the right if you remembered it or to the left if you don't",
                R.drawable.ic_third_onboard
            )
        );
        list.add(
            ViewPagerModel(
                "Your profile",
                "Track your achievements and experience",
                R.drawable.ic_fourth_onboard
            )
        );
        list.add(
            ViewPagerModel(
                "Let's get started!",
                "Let's do it!",
                R.drawable.ic_fifth_onboard
            )
        );

        return list
    }
}