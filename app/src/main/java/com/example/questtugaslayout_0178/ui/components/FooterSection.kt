package com.example.questtugaslayout_0178.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import com.example.questtugaslayout_0178.R
import com.example.questtugaslayout_0178.ui.util.spResource

@Composable
fun FooterSection(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = dimensionResource(R.dimen.footer_padding)),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = stringResource(R.string.footer_copyright),
            color = colorResource(R.color.text_primary),
            fontSize = spResource(R.dimen.text_size_footer)
        )
    }
}