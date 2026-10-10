package com.example.questtugaslayout_0178.data

import androidx.compose.ui.text.font.FontFamily
import com.example.questtugaslayout_0178.R
import com.example.questtugaslayout_0178.model.Character

object CharacterData {
    val characters = listOf(
        Character(
            imageRes = R.drawable.miles_morales,
            nameRes = R.string.miles_name,
            locationRes = R.string.miles_location,
            cardColorRes = R.color.miles_card,
            nameColorRes = R.color.miles_name,
            locationColorRes = R.color.miles_location,
            fontFamily = FontFamily.Cursive
        ),
        Character(
            imageRes = R.drawable.gwen_stacy,
            nameRes = R.string.gwen_name,
            detailRes = R.string.gwen_detail,
            locationRes = R.string.gwen_location,
            cardColorRes = R.color.gwen_card,
            nameColorRes = R.color.gwen_name,
            detailColorRes = R.color.gwen_detail,
            locationColorRes = R.color.gwen_location,
            fontFamily = FontFamily.SansSerif
        ),
        Character(
            imageRes = R.drawable.peter_b_parker,
            nameRes = R.string.peter_name,
            detailRes = R.string.peter_detail,
            locationRes = R.string.peter_location,
            cardColorRes = R.color.peter_card,
            nameColorRes = R.color.peter_name,
            detailColorRes = R.color.peter_detail,
            locationColorRes = R.color.peter_location,
            fontFamily = FontFamily.Serif
        ),
        Character(
            imageRes = R.drawable.spider_noir,
            nameRes = R.string.noir_name,
            detailRes = R.string.noir_detail,
            locationRes = R.string.noir_location,
            cardColorRes = R.color.noir_card,
            nameColorRes = R.color.noir_name,
            detailColorRes = R.color.noir_detail,
            locationColorRes = R.color.noir_location,
            fontFamily = FontFamily.Monospace
        )
    )
}