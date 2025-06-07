package com.taknikiniga.editor.jetpackcomposeseries.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.taknikiniga.editor.jetpackcomposeseries.R
import com.taknikiniga.editor.jetpackcomposeseries.ui.components.HeaderComp

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    var isExpended by remember { mutableStateOf(false) }

    Column {
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

}