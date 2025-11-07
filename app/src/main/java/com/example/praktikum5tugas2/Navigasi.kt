package com.example.praktikum5tugas2.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.praktikum5tugas2.view.FormDataDiri1
import com.example.praktikum5tugas2.view.HalamanUtama
import com.example.praktikum5tugas2.view.TampilData

enum class Navigasi {
    Home,
    Formulir,
    TampilData
}

