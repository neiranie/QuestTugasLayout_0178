package com.example.questtugaslayout_0178.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import com.example.questtugaslayout_0178.R
import com.example.questtugaslayout_0178.ui.util.spResource

@Composable
fun HeaderSection(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = dimensionResource(R.dimen.header_padding_vertical)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(R.string.header_title),
            color = colorResource(R.color.text_primary),
            fontSize = spResource(R.dimen.text_size_title),
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
        Text(
            text = stringResource(R.string.header_subtitle),
            color = colorResource(R.color.text_primary),
            fontSize = spResource(R.dimen.text_size_subtitle),
            fontWeight = FontWeight.Bold
        )
    }
}