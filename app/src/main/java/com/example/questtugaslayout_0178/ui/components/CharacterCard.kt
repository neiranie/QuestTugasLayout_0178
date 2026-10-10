package com.example.questtugaslayout_0178.ui.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import com.example.questtugaslayout_0178.R
import com.example.questtugaslayout_0178.model.Character
import com.example.questtugaslayout_0178.ui.util.spResource

@Composable
fun CharacterCard(
    character: Character,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(dimensionResource(R.dimen.card_corner_radius)))
            .background(colorResource(character.cardColorRes))
            .padding(dimensionResource(R.dimen.card_padding)),
        verticalAlignment = Alignment.CenterVertically
    ) {
        CardImage(character.imageRes, stringResource(character.nameRes))

        Column(
            modifier = Modifier
                .weight(1f)
                .padding(horizontal = dimensionResource(R.dimen.card_text_padding))
        ) {
            Text(
                text = stringResource(character.nameRes),
                color = colorResource(character.nameColorRes),
                fontFamily = character.fontFamily,
                fontWeight = FontWeight.Bold,
                fontSize = spResource(R.dimen.text_size_name)
            )
            if (character.detailRes != null && character.detailColorRes != null) {
                Text(
                    text = stringResource(character.detailRes),
                    color = colorResource(character.detailColorRes),
                    fontFamily = character.fontFamily,
                    fontSize = spResource(R.dimen.text_size_detail)
                )
            }
            Text(
                text = stringResource(character.locationRes),
                color = colorResource(character.locationColorRes),
                fontFamily = character.fontFamily,
                fontSize = spResource(R.dimen.text_size_location)
            )
        }

        CardImage(character.imageRes, stringResource(character.nameRes))
    }
}

@Composable
private fun CardImage(@DrawableRes imageRes: Int, contentDescription: String) {
    Image(
        painter = painterResource(imageRes),
        contentDescription = contentDescription,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(dimensionResource(R.dimen.card_image_size))
            .clip(CircleShape)
    )
}