package com.taknikiniga.editor.jetpackcomposeseries.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SeeMoreComp(
    modifier: Modifier = Modifier,
    title: String,
    hasCount: Boolean = false,
    count: Int = 0,
    shape: Shape = RectangleShape,
    trailingTitle: String = "See More",
    trailingTitleColor: Color = MaterialTheme.colorScheme.secondary,
    onClick: () -> Unit = {}
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()
    ) {

        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(title, style = MaterialTheme.typography.titleMedium)
            Spacer(modifier = Modifier.padding(4.dp))
            if (hasCount) {
                Text(
                    "$count",
                    modifier = Modifier
                        .clip(shape)
                        .background(
                            color = MaterialTheme.colorScheme.secondaryContainer.copy(alpha = 0.8f)
                        )
                        .padding(vertical = 4.dp, horizontal = 8.dp),
                    style = MaterialTheme.typography.labelSmall
                )
            }
        }
        Text(
            trailingTitle,
            style = MaterialTheme.typography.labelMedium,
            color = trailingTitleColor, modifier =
            Modifier.clickable { onClick() }
        )
    }
}


@Preview(showSystemUi = true)
@Composable
fun PrevSeeMoreComp(modifier: Modifier = Modifier) {
    Surface(modifier = Modifier.safeContentPadding()) {

        SeeMoreComp(
            title = "Upcoming Schedule",
            hasCount = true,
            count = 2,
            onClick = {},
            shape = CircleShape
        )

    }
}