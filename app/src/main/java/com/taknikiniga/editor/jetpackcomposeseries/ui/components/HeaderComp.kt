package com.taknikiniga.editor.jetpackcomposeseries.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.taknikiniga.editor.jetpackcomposeseries.R

@Composable
fun HeaderComp(
    modifier: Modifier = Modifier,
    title: String,
    location: String,
    locationIcon: Int,
    expandIcon: Int,
    isExpended: Boolean = false,
    onExpand: () -> Unit = {},
    iconSize: Dp = 16.dp,
    notifyIcon: Int,
    onNotifyClick: () -> Unit = {},
) {

    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = modifier
            .safeContentPadding()
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Column {
            Text(
                title,
                style = MaterialTheme.typography.labelSmall, color = Color.Gray
            )
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                IconComp(icon = locationIcon, size = iconSize)
                Text(location, style = MaterialTheme.typography.labelMedium)
                IconComp(icon = expandIcon, onClick = onExpand, size = iconSize)
            }
        }
        IconComp(
            icon = notifyIcon,
            clip = true,
            onClick = onNotifyClick,
            tintColor = Color.Unspecified,
            size = 20.dp,
            shape = CircleShape
        )
    }

}

@Preview(showSystemUi = true)
@Composable
private fun HeaderCompPrev() {
    var isExpended by remember { mutableStateOf(false) }

    HeaderComp(
        title = "Location",
        location = "New Delhi, INDIA",
        onExpand = {},
        modifier = Modifier,
        expandIcon = if (isExpended) R.drawable.expand_arrow else R.drawable.expand_arrow,
        onNotifyClick = {},
        isExpended = isExpended,
        notifyIcon = R.drawable.notification, locationIcon = R.drawable.location
    )
}