package com.example.praktikum5tugas2.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.praktikum5tugas2.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TampilData(
    onBackBtnClick: () -> Unit,
    onFormulirBtnClick: () -> Unit
) {
    val colorHeader = Color(0xFF9060DE)
    val colorBackground = Color(0xFFF0EAFC)
    val colorBox = Color(0xFFE9DFFF)
    val colorButtonDark = Color(0xFF7B42DE)
    val colorButtonLight = Color(0xFFA681EA)

    val items = listOf(
        Pair(first = stringResource(id = R.string.nama_lengkap), second = "Annisa Dian Amarta"),
        Pair(first = stringResource(id = R.string.jenis_kelamin), second = "Lainnya"),
        Pair(first = "STATUS PERKAWINAN", second = "Belum Menikah"),
        Pair(first = "ALAMAT", second = "Yogyakarta")
    )

