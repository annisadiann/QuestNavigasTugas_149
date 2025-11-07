package com.example.praktikum5tugas2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.praktikum5tugas2.navigation.PengaturNavigasi
import com.example.praktikum5tugas2.ui.theme.Praktikum5Tugas2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Praktikum5Tugas2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    PengaturNavigasi(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}
