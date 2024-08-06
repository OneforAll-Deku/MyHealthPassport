package com.example.myhealthpassport.Health

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.myhealthpassport.Navigation.Screen

@Composable
fun MainHealthActivity(navController: NavController){

    val context = LocalContext.current

    val gradient = Brush.horizontalGradient(
        colors = listOf(Color(0xFF00BCD4), Color(0xFF1E88E5))
    )

    val gradientx = Brush.horizontalGradient(
        colors = listOf(Color(0xFFDF1039),Color(0xFFDF1039))
    )

    Column(modifier = Modifier
        .fillMaxWidth()) {
        Text(text = "Life is all about being Healthy!", fontSize = 26.sp, modifier = Modifier
            .padding(30.dp),
            color = Color.Black,
            textAlign = TextAlign.Center
        )
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .paddingFromBaseline(top = 10.dp, bottom = 10.dp),
            color = MaterialTheme.colorScheme.background
        ) {
            Box {
                AnimatedPreloaderMainHealthActivity(modifier = Modifier
                    .size(400.dp, 350.dp)
                    .align(Alignment.Center)
                   // .scale(scaleX = 1.3f, scaleY = 1.6f)
                )
            }
        }
        Row(modifier = Modifier
            .fillMaxWidth()) {
            ExtendedFloatingActionButton(
                onClick = { navController.navigate(Screen.HealthInfo.route) },
                modifier = Modifier
                    .padding(30.dp)
                    .padding(0.dp, 10.dp)
                    .weight(1f)
                    .background(gradient, shape = RoundedCornerShape(8.dp))
            ) {
                Text(text = "Save your Data!")
            }
            ExtendedFloatingActionButton(
                onClick = { navController.navigate(Screen.GetHealthInfo.route) },
                modifier = Modifier
                    .padding(30.dp)
                    .padding(0.dp, 10.dp)
                    .weight(1f)
                    .background(gradient, shape = RoundedCornerShape(8.dp))
            ) {
                Text(text = "Get your Data!")
            }
        }
        ExtendedFloatingActionButton(onClick = { navController.navigate(Screen.EmergencyContacts.route) },
            modifier = Modifier
                .padding(8.dp)
                .align(Alignment.CenterHorizontally)
                .background(gradientx, shape = RoundedCornerShape(8.dp))
        ) {
            Text(text = "Emergency Helpline numbers")
        }
        ExtendedFloatingActionButton(onClick = { navController.navigate(Screen.HealthAiScreen.route) },
            modifier = Modifier
                .padding(8.dp)
                .align(Alignment.CenterHorizontally)
                .background(gradientx, shape = RoundedCornerShape(8.dp))
        ) {
            Text(text = "Medical Certificate Analyser")
        }

        TextButton(onClick = { val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/myhealthpassport?igsh=YzljYTk1ODg3Zg=="))
                                context.startActivity(intent)
                             }, modifier = Modifier.padding(50.dp).align(alignment = Alignment.CenterHorizontally)) {
            Text(text = "Community and Support", textDecoration = TextDecoration.Underline)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainHealthActivityPreview(){
    MainHealthActivity(navController = rememberNavController())
}

