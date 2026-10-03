package com.example.pertemuan3

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Tugas(modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize()) {

        // Latar belakang
        Image(
            painter = painterResource(id = R.drawable.latar),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Login",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Blue
            )
            Text(
                text = "Ini adalah halaman login,",
                fontSize = 14.sp,
                color = Color.Black
            )

            Spacer(modifier = Modifier.height(40.dp))

            // Logo Pemancing
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Logo Pemancing",
                modifier = Modifier.size(140.dp)
            )

            Spacer(modifier = Modifier.height(60.dp))

            Text(
                text = "Nama",
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Cyan
            )
            Text(
                text = "Dimas Pramudita Surya Pratama",
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Yellow
            )
            Text(
                text = "20240140273",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Red
            )

            Spacer(modifier = Modifier.height(8.dp))

            // Foto bulat dengan border putih
            Image(
                painter = painterResource(id = R.drawable.pemancing),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .size(290.dp)
                    .clip(CircleShape)
                    .background(Color(0xFFE8E8F4))
                    .border(width = 3.dp, color = Color.White, shape = CircleShape)
            )
        }
    }
}