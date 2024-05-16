package com.example.uts_ppb.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.uts_ppb.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavHostController){
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("KAI App") },
                navigationIcon = { IconButton(onClick = {navController.navigate("Home")}) {
                        Icon(Icons.Filled.ArrowBack, contentDescription = "Back")
                    }
                }
            )
        },
        bottomBar = {
            BottomAppBarContent()
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
        ) {
            Text(
                text = "Selamat Siang\nMuhammad Ismail",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Blue,
                modifier = Modifier.padding(bottom = 16.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Row{
                IconTextButton(
                    iconRes = R.drawable.antar_kota, // Ganti dengan ID drawable Anda
                    text = "Antar Kota",
                    onClick = {navController.navigate("Schedule")}
                )
                IconTextButton(
                    iconRes = R.drawable.lokal, // Ganti dengan ID drawable Anda
                    text = "Lokal",
                    onClick = {}
                )
                IconTextButton(
                    iconRes = R.drawable.commuter, // Ganti dengan ID drawable Anda
                    text = "Commuter Line",
                    onClick = {}
                )
            }

            // Tambahkan button untuk pilihan lainnya sesuai kebutuhan
        }
    }
}
@Composable
fun IconTextButton(
    iconRes: Int,
    text: String,
    onClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .width(80.dp)
            .clickable(onClick = onClick),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(56.dp)
                .clip(CircleShape)
        ) {
            Image(
                painter = painterResource(id = iconRes),
                contentDescription = null,
                modifier = Modifier.size(64.dp)
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = text,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun BottomAppBarContent() {
    BottomAppBar(
        containerColor = Color.Blue,
        contentColor = Color.White
    ) {
        NavigationBarItem(
            icon = { Image(painterResource(id = R.drawable.home), contentDescription = "Kereta Api") },
            label = { Text("Home", modifier = Modifier.height(15.dp), color=Color.White) },
            selected = false,
            onClick = {}
        )
        NavigationBarItem(
            icon = { Image(painterResource(id = R.drawable.kereta), contentDescription = "Kereta") },
            label = { Text("Kereta", modifier = Modifier.height(15.dp), color=Color.White) },
            selected = false,
            onClick = {}
        )
        NavigationBarItem(
            icon = { Image(painterResource(id = R.drawable.jadwal), contentDescription = "Jadwal") },
            label = { Text("Jadwal", modifier = Modifier.height(15.dp), color=Color.White) },
            selected = false,
            onClick = {}
        )
        NavigationBarItem(
            icon = { Image(painterResource(id = R.drawable.diskon), contentDescription = "Diskon") },
            label = { Text("Diskon", modifier = Modifier.height(15.dp), color=Color.White) },
            selected = false,
            onClick = {}
        )
        NavigationBarItem(
            icon = { Image(painterResource(id = R.drawable.akun), contentDescription = "Akun") },
            label = { Text("Akun", modifier = Modifier.height(15.dp), color=Color.White) },
            selected = false,
            onClick = {}
        )
    }
}