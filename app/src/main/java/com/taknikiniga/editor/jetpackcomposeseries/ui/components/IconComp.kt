package com.taknikiniga.editor.jetpackcomposeseries.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import coil3.compose.AsyncImagePainter.State.Empty.painter

@Composable
fun IconComp(
    modifier: Modifier = Modifier,
    iconModifier: Modifier = Modifier,
    icon: Int,
    contentDescription: String = "",
    tintColor: Color = MaterialTheme.colorScheme.primary,
    backgroundColor: Color = MaterialTheme.colorScheme.surface,
    clip: Boolean = false,
    shape: Shape = RectangleShape,
    size: Dp = 24.dp,
    onClick: () -> Unit = {},
) {
    Surface(
        modifier = modifier
            .size(size),
        shape = if (clip) shape else shape,
        color = if (clip) backgroundColor else Color.Unspecified, onClick = onClick
    ) {
        Icon(
            painter = painterResource(icon),
            contentDescription = contentDescription,
            tint = tintColor,
            modifier = iconModifier
                .size(size)
        )
    }


}

@Composable
fun IconComp(
    modifier: Modifier = Modifier,
    img: String,
    contentDescription: String = "",
    tintColor: Color = MaterialTheme.colorScheme.primary,
    clip: Boolean = false,
    shape: Shape = RectangleShape,
    size: Dp = 24.dp,
    onClick: () -> Unit = {},
) {

    AsyncImage(
        model = img,
        contentDescription = contentDescription,
        modifier = modifier
            .size(size)
            .clickable {
                onClick()
            }
            .clip(if (clip) shape else shape),
    )

}