package com.example.profilecard2026

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.profilecard2026.ui.theme.ProfileCard2026Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProfileCard2026Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                   //TODO: change to final Profile Card
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}
//TODO: delete from final project
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Surface(color = Color.LightGray) {
        Text(
            text = "Hello $name!",
            modifier = modifier
                .padding(16.dp)
        )
    }
}
//Function to contain and style other functions
//TODO: add style to box, arrange elements of profile card, create preview
@Composable
fun ProfileCard(){
    Box{
       ProfileImage()

//       ProfileText()
    }
}
//function to contain and style image
//TODO: add image, style image, add image context
@Composable
fun ProfileImage(){

}
//function to contain and style text
//TODO: add text, style text, add alternate text feature
@Composable
fun ProfileText(name: String, bio: String, modifier: Modifier = Modifier){
    Column(modifier = modifier) {
        Text(
            text = "$name",
            fontSize = 15.sp,
            lineHeight = 20.sp
        )
        Text(
            text  = "$bio",
            fontSize = 5.sp,
            lineHeight = 10.sp
        )
    }
  

}

//TODO: change or delete
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ProfileCard2026Theme {
        Greeting("Android")
    }
}
@Preview
@Composable
fun ProfileTextPreview(){
    ProfileCard2026Theme {
        ProfileText("Daniel Andrews", "Test Test Test")
    }
}