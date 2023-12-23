package com.example.mywishlist.Data

import com.example.mywishlist.R

class FakeRepository {
    fun getItems(): List<Item> {
        return listOf(
            Item(
                title = "Controler",
                website = "https://www.pexels.com/search/game%20controller/",
                img = "https://images.pexels.com/photos/2520829/pexels-photo-2520829.jpeg?cs=srgb&dl=pexels-stas-knop-2520829.jpg&fm=jpg",
                priority = Priority.High
            ),
            Item(
                title = "PlayButton",
                website = "https://www.pexels.com/search/game%20controller/",
                img = "https://images.pexels.com/photos/2520829/pexels-photo-2520829.jpeg?cs=srgb&dl=pexels-stas-knop-2520829.jpg&fm=jpg",
                priority = Priority.High
            ),
            Item(
                title = "Playstation 5",
                website = "https://www.playstation.com/en-in/ps5/",
                imgLocal = R.drawable.exersice_1,
                isImgLocal = true,
            )
        )
    }
}
