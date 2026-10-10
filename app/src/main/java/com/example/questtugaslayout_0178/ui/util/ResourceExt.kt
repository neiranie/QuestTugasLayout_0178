package com.example.questtugaslayout_0178.ui.util

import androidx.annotation.DimenRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.TextUnit

@Composable
fun spResource(@DimenRes id: Int): TextUnit {
    val dp = dimensionResource(id)
    return with(LocalDensity.current) { dp.toSp() }
}