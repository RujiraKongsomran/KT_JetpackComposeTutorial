package com.rujirakongsomran.kt_jetpackcomposetutorial

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        setContent {
            //Greeting("Android")
            //NewsStory()
            //ArtistCard()
            //AlignInRow()
            //PaddedComposable()
            //SizedComposable()
            //FixedSizeComposable
            //FillSizeComposable
            MatchParentSizeComposable()
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
        MaterialTheme {
            val typography = MaterialTheme.typography
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.header),
                    contentDescription = null,
                    modifier = Modifier
                        .height(180.dp)
                        .fillMaxWidth()
                        .clip(shape = RoundedCornerShape(4.dp)),
                    contentScale = ContentScale.Crop
                )

                Spacer(Modifier.height(16.dp))
                Text(
                    "A day wandering through the sandhills " +
                            "in Shark Fin Cove, and a few of the " +
                            "sights I saw",
                    style = typography.h6,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
                Text(
                    "Davenport, California",
                    style = typography.body2
                )
                Text(
                    "December 2018",
                    style = typography.body2
                )
            }
        }
    }

//    @Preview
//    @Composable
//    fun DefaultPreview() {
//        NewsStory()
//    }

    @Composable
    fun ArtistCard() {
        MaterialTheme() {
            val typography = MaterialTheme.typography
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(16.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.header),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,            // crop the image if it's not a square
                    modifier = Modifier
                        .size(64.dp)
                        .clip(CircleShape)                       // clip to the circle shape
                )
                Spacer(Modifier.width(16.dp))
                Column {
                    Text(
                        "Avenport, California",
                        style = typography.h6
                    )
                    Text(
                        "3 minutes ago",
                        style = typography.body1
                    )
                }
            }
        }
    }

//    @Preview
//    @Composable
//    fun PreviewArtistCard() {
//        ArtistCard()
//    }

    @Composable
    fun AlignInRow() {
        Row(
            modifier = Modifier
                .size(150.dp)
                .background(Color.Yellow),
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                Modifier
                    .size(50.dp)
                    .background(Color.Red)
            )
            Box(
                Modifier
                    .size(50.dp)
                    .background(Color.Blue)
            )
        }
    }

    @Composable
    fun PaddedComposable() {
        Text(
            "Hello", modifier = Modifier
                .background(Color.Green)
                .padding(20.dp)
        )
    }

    @Composable
    fun SizedComposable() {
        Box(
            Modifier
                .size(100.dp, 100.dp)
                .background(Color.Red)
        )
    }

    @Composable
    fun FixedSizeComposable() {
        Box(
            Modifier
                .size(90.dp, 150.dp)
                .background(Color.Green)
        ) {
            Box(
                Modifier
                    .requiredSize(100.dp, 100.dp)
                    .background(Color.Red)
            )
        }
    }

    @Composable
    fun FillSizeComposable() {
        Box(
            Modifier
                .background(Color.Green)
                .size(50.dp)
                .padding(10.dp)
        ) {
            Box(
                Modifier
                    .background(Color.Blue)
                    .fillMaxSize()
            )
        }
    }

    @Composable
    fun MatchParentSizeComposable() {
        Box {
            Spacer(
                Modifier
                    .matchParentSize()
                    .background(Color.Green)
            )
            Text("Hello World")
        }
    }
}
