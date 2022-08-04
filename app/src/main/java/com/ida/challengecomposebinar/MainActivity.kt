package com.ida.challengecomposebinar

import android.graphics.Color
import android.os.Bundle
import android.text.InputType
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusOrder
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.accompanist.insets.navigationBarsWithImePadding
import com.ida.challengecomposebinar.ui.theme.ChallengeComposeBinarTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ChallengeComposeBinarTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Login()
                }
            }
        }
    }
}

@Composable
fun Login(){
    Column(
        Modifier
            .navigationBarsWithImePadding()
            .padding(24.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(16.dp, alignment = Alignment.Bottom),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_chill),
            null,
            Modifier.size(100.dp),
//            tint = androidx.compose.ui.graphics.Color.Transparent
        )
        TextInput()
        TextInput()
        Button(onClick = {}, modifier = Modifier.fillMaxWidth()) {
            Text("SIGN IN", Modifier.padding(vertical = 8.dp))
        }
        Divider(
            color = androidx.compose.ui.graphics.Color.White.copy(alpha = 0.3f),
            thickness = 1.dp,
            modifier = Modifier.padding(top = 48.dp)
        )
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text("Don't have an account?", color = androidx.compose.ui.graphics.Color.Black)
            TextButton(onClick = {}) {
                Text("SING UP")
            }
        }
    }
}

@Composable
fun TextInput(){

    var value by remember { mutableStateOf("") }

    TextField(value = value, onValueChange = {value = it})
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    ChallengeComposeBinarTheme {
        Login()
    }
}