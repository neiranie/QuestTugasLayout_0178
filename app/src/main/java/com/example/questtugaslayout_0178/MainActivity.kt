package com.example.questtugaslayout_0178

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.questtugaslayout_0178.ui.screen.MainScreen
import com.example.questtugaslayout_0178.ui.theme.QuestTugasLayout_0178Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuestTugasLayout_0178Theme {
                MainScreen()
            }
        }
    }
}