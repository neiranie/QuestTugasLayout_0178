package com.example.questtugaslayout_0178.ui.screen

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import com.example.questtugaslayout_0178.R
import com.example.questtugaslayout_0178.data.CharacterData
import com.example.questtugaslayout_0178.model.Character
import com.example.questtugaslayout_0178.ui.components.CharacterCard
import com.example.questtugaslayout_0178.ui.components.FooterSection
import com.example.questtugaslayout_0178.ui.components.HeaderSection

@Composable
fun MainScreen(
    characters: List<Character> = CharacterData.characters,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(colorResource(R.color.screen_background))
            .systemBarsPadding()
            .padding(horizontal = dimensionResource(R.dimen.screen_padding))
    ) {
        HeaderSection()

        LazyColumn(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.card_spacing))
        ) {
            items(characters) { character ->
                CharacterCard(character = character)
            }
        }

        FooterSection()
    }
}

@Preview(showBackground = true)
@Composable
private fun MainScreenPreview() {
    MainScreen()
}