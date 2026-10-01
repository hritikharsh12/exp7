package com.example.exp7

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.example.exp7.ui.screens.AdaptiveMainScreen
import com.example.exp7.ui.theme.Exp7Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Exp7Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    AdaptiveMainScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Preview(name = "Phone Portrait", device = Devices.PHONE, showBackground = true)
@Preview(name = "Tablet Dual Pane", device = Devices.TABLET, showBackground = true)
@Preview(name = "Foldable Unfolded", device = Devices.FOLDABLE, showBackground = true)
@Composable
fun AdaptiveAppPreview() {
    Exp7Theme {
        AdaptiveMainScreen()
    }
}
