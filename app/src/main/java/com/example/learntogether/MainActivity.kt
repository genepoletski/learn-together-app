package com.example.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learntogether.ui.theme.LearnTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearnTogetherTheme {
                Surface {
                    Article()
                }
            }
        }
    }
}

@Composable
fun HeroImage(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.hero_image)
    Box(modifier) {
        Image(
            painter = image,
            contentDescription = null
        )
    }
}

@Composable
fun Title(modifier: Modifier = Modifier) {
    Text(
        text = stringResource(R.string.article_title),
        fontSize = 24.sp,
        modifier = modifier
            .padding(top = 16.dp, bottom = 16.dp)
    )
}

@Composable
fun Body(modifier: Modifier = Modifier) {
    Column(modifier) {
        Text(
            text = stringResource(R.string.aticle_paragraph_1),
            textAlign = TextAlign.Justify
        )
        Text(
            text = stringResource(R.string.article_paragraph_2),
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(top = 16.dp, bottom = 16.dp)
        )
    }
}

@Composable
fun Article() {
    Column {
        HeroImage()
        Title(modifier = Modifier.padding(start = 16.dp, end = 16.dp))
        Body(modifier = Modifier.padding(start = 16.dp, end = 16.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LearnTogetherTheme {
        Article()
    }
}