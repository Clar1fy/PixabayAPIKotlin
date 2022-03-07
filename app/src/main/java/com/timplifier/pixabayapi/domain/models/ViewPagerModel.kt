package com.timplifier.pixabayapi.domain.models

class ViewPagerModel {

    private var title: String? = null
    private var description: String? = null
    private var image: Int


    constructor(title: String?, description: String?, image: Int) {
        this.title = title
        this.description = description
        this.image = image
    }

}