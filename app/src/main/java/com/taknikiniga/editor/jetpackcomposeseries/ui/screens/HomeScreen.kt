package com.taknikiniga.editor.jetpackcomposeseries.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.taknikiniga.editor.jetpackcomposeseries.R
import com.taknikiniga.editor.jetpackcomposeseries.ui.components.Appointment
import com.taknikiniga.editor.jetpackcomposeseries.ui.components.HeaderComp
import com.taknikiniga.editor.jetpackcomposeseries.ui.components.SearchComp
import com.taknikiniga.editor.jetpackcomposeseries.ui.components.SeeMoreComp


@Preview(showSystemUi = true)
@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    var isExpended by remember { mutableStateOf(false) }

    Column(horizontalAlignment = Alignment.CenterHorizontally) {
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
        SearchComp(icon = R.drawable.search, value = "", onValueChange = {})

        SeeMoreComp(
            title = "Upcoming Schedule",
            hasCount = true,
            count = 2,
            onClick = {},
            shape = CircleShape
        )
        Appointment(
            docName = "Dr, Akaba Rueter",
            docSpec = "Dental Consultation",
            date = "Monday, 26 July",
            time = "09:00 - 10:00",
            docImg = "https://picsum.photos/200",
            onClick = {},
            onCall = {},
            docImageClipShape = CircleShape,
            cardColor = MaterialTheme.colorScheme.primary
        )

    }

}