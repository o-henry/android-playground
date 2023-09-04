package com.example.modernandroidcookbook

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class City(
    val id: Int,
    @StringRes val nameResourceId: Int,
    val imageResourceId: Int
)
