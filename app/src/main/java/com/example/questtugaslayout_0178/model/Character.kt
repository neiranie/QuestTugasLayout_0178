package com.example.questtugaslayout_0178.model

import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.ui.text.font.FontFamily

data class Character(
    @DrawableRes val imageRes: Int,
    @StringRes val nameRes: Int,
    @StringRes val detailRes: Int? = null, // null = kartu hanya 2 teks
    @StringRes val locationRes: Int,
    @ColorRes val cardColorRes: Int,
    @ColorRes val nameColorRes: Int,
    @ColorRes val detailColorRes: Int? = null,
    @ColorRes val locationColorRes: Int,
    val fontFamily: FontFamily
)