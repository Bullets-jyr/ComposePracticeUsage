package kr.co.bullets.composepracticeusage.ui.components.movie

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

private val CARD_WIDTH = 150.dp

@Composable
fun MovieItem() {
    Column(
        modifier = Modifier
            .width(CARD_WIDTH)
            .padding(10.dp)
    ) {
        Poster(
            modifier = Modifier
                .width(CARD_WIDTH)
        )
        Text(
            text = "The Lord of the Ring",
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.padding(
                top = 11.dp
            )
        )
        Row(
            modifier = Modifier.padding(
                vertical = 10.dp
            ),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "9.0")
        }
    }
}

@Composable
fun Poster(
    modifier: Modifier
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
    ) {
        Box(modifier = Modifier.background(Color.Blue)) {

        }
    }
}

@Preview
@Composable
fun MovieItemPreview() {
    MovieItem()
}
