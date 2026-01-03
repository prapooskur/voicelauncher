package com.pras.voicelauncher

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intent = Intent(Intent.ACTION_VOICE_COMMAND)
        startActivity(intent)
        finish()
//        enableEdgeToEdge()
//        setContent {
//            VoicelauncherTheme {
//                val intent = Intent(Intent.ACTION_VOICE_COMMAND)
//                startActivity(intent)
//                // empty surface
//                Surface(Modifier.fillMaxSize(), color = Color.DarkGray) {
//
//                }
//                finish()
//            }
//        }
    }
}
