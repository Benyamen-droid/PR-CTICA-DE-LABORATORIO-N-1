package com.example.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

/**
 * Actividad 1 - Sesión 4: Layouts (SIS 227 Desarrollo de Plataformas II)
 *
 * Estructura:
 * Column (fillMaxSize)
 *  ├── Box  (weight 1f) -> Cyan    "Ejemplo 1" (centrado)
 *  ├── Row  (weight 1f)
 *  │    ├── Box (weight 1f) -> Red    "Ejemplo 2" (centrado)
 *  │    └── Box (weight 1f) -> Green  "Ejemplo 3" (centrado)
 *  └── Box  (weight 1f) -> Magenta "Ejemplo 4" (abajo al centro)
 */
@Preview(showBackground = true)
@Composable
fun Actividad1() {
    Column(modifier = Modifier.fillMaxSize()) {

        // Ejemplo 1: ocupa 1/3 de la altura, texto centrado
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Cyan),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Ejemplo 1")
        }

        // Ejemplos 2 y 3: una Row que ocupa 1/3 de la altura
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Red),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "Ejemplo 2")
            }

            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Green),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "Ejemplo 3")
            }
        }

        // Ejemplo 4: ocupa 1/3 de la altura, texto abajo al centro
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Magenta),
            contentAlignment = Alignment.BottomCenter
        ) {
            Text(text = "Ejemplo 4")
        }
    }
}
