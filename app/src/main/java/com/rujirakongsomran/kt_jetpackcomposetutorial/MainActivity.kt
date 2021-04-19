package com.rujirakongsomran.kt_jetpackcomposetutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        setContent {
            //Greeting("Android")
            NewsStory()
        }
    }

//    @Composable
//    fun Greeting(name: String) {
//        Text(text = "Hello $name")
//    }
//
//    @Preview
//    @Composable
//    fun PreviewGreeting() {
//        Greeting("Android")
//    }

    @Composable
    fun NewsStory() {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.header),
                contentDescription = null,
                modifier = Modifier
                    .height(180.dp)
                    .fillMaxWidth(),
                contentScale = ContentScale.Crop
            )

            Spacer(Modifier.height(16.dp))
            Text("A day in Shark Fin Cove")
            Text("Davenport, California")
            Text("December 2018")
        }
    }

    @Preview
    @Composable
    fun DefaultPreview() {
        NewsStory()
    }
}