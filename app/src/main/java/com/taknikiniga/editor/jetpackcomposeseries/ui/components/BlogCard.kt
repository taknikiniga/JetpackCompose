package com.taknikiniga.editor.jetpackcomposeseries.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.taknikiniga.editor.jetpackcomposeseries.R

@Composable
fun BlogCard(
    modifier: Modifier = Modifier,
    background: Color,
    img: String,
    rating: Float,
    ratingIcon: Int,
    title: String,
    description: String,
    shape: Shape = MaterialTheme.shapes.medium
) {
    Surface(modifier = modifier, color = background, shape = shape) {
        Column(modifier = Modifier, verticalArrangement = Arrangement.SpaceBetween) {
            Box(
                modifier = Modifier
                    .height(110.dp)
                    .fillMaxWidth()
            ) {

                AsyncImage(
                    model = img,
                    contentDescription = "",
                    modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop
                )

                Box(
                    modifier = Modifier
                        .padding(6.dp)
                        .clip(
                            RoundedCornerShape(
                                bottomStartPercent = 30,
                                topStartPercent = 30,
                                topEndPercent = 30
                            )
                        )
                        .background(color = MaterialTheme.colorScheme.surface)
                        .align(Alignment.BottomEnd)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(8.dp)
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.star),
                            contentDescription = "",
                            modifier = Modifier.size(24.dp), tint = Color.Unspecified
                        )
                        Text("4.5")

                    }
                }
            }
            Column(modifier = Modifier.padding(16.dp)) {
                Text(title, style = MaterialTheme.typography.titleMedium, maxLines = 1)
                Text(description, style = MaterialTheme.typography.bodyMedium, maxLines = 1)
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun BlogCardPrev() {
    BlogCard(
        modifier = Modifier
            .width(250.dp)
            .height(200.dp),
        background = MaterialTheme.colorScheme.primaryContainer,
        img = "",
        rating = 4.5f,
        ratingIcon = 0,
        title = "Elevate Dental",
        description = "lorem ipsum dolor sit amet, consectetur adipiscing elit"
    )
}