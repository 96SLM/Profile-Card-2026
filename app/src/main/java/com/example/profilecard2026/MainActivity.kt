package com.example.profilecard2026

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
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
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(8.dp),
                    color = MaterialTheme.colorScheme.background
                ){
                    ProfileCard(
                        stringResource(R.string.daniel_andrews),
                        stringResource(R.string.bio_text)
                    )
                }
            }
        }
    }
}

//Function to contain and style other functions
//TODO: add style to box, arrange elements of profile card, create preview
@Composable
fun ProfileCard(name: String, bio: String, modifier: Modifier = Modifier){
    val imageP = painterResource(R.drawable.daniel_andrews_profile_circle)
    val imageB = painterResource(R.drawable.background_image_20s)
    val borderWidth = 4.dp

    Image(
        painter = imageB,
        contentDescription = "A 90s style background called a Memphis style pattern",
        contentScale = ContentScale.Crop,
        alpha = 0.75F,
        modifier = Modifier.fillMaxSize()
    )
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Image(
            painter = imageP,
            contentDescription = "A 90s kid with shades, posing with his arms crossed",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(150.dp)
                .border(
                    BorderStroke(borderWidth, Color.Cyan),
                    CircleShape
                )
                .padding(borderWidth)
                .clip(CircleShape)
            //.align(Alignment.TopStart)
        )
        ProfileText(
            name = name,
            bio = bio,
            modifier = modifier.padding(8.dp)
        )
    }
}

//function to contain and style image
//TODO: add image, style image, add image context
//@Composable
//fun ProfileImage(){
//}

//function to contain and style text
//TODO: add text, style text, add alternate text feature
@Composable
fun ProfileText(name: String, bio: String, modifier: Modifier = Modifier){
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Text(
            text = name,
            fontSize = 52.sp,
            lineHeight = 60.sp,
            textAlign = TextAlign.Start
        )
        Text(
            text  = bio,
            fontSize = 24.sp,
            modifier = modifier
                .padding(16.dp)
                .align(alignment = Alignment.Start)
        )
    }
  

}

//previews ProfileCard function
@Preview
@Composable
fun ProfileCardPreview(){
    ProfileCard2026Theme {
        ProfileCard(
            stringResource(R.string.daniel_andrews),
            stringResource(R.string.bio_text)
        )
    }
}