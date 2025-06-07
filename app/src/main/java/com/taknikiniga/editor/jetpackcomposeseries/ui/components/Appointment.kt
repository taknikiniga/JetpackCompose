package com.taknikiniga.editor.jetpackcomposeseries.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.taknikiniga.editor.jetpackcomposeseries.R

@Composable
fun Appointment(
    modifier: Modifier = Modifier,
    docImg: String,
    docImageClipShape: Shape = RectangleShape,
    docName: String,
    docSpec: String,
    time: String,
    date: String,
    callIcon: Int = R.drawable.call,
    cardColor: Color = MaterialTheme.colorScheme.primaryContainer,
    onClick: () -> Unit = {},
    onCall: () -> Unit = {}
) {

    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = cardColor), onClick = onClick
    ) {

        Column(modifier = Modifier.padding(bottom = 16.dp)) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    AsyncImage(
                        model = docImg,
                        contentDescription = "",
                        modifier = Modifier
                            .clip(
                                docImageClipShape
                            )
                            .size(40.dp)
                            .background(color = MaterialTheme.colorScheme.surface),
                        placeholder = painterResource(R.drawable.heart)
                    )
                    Spacer(modifier = Modifier.padding(8.dp))

                    Row {
                        Column {
                            Text(docName, style = MaterialTheme.typography.titleMedium)
                            Text(
                                docSpec,
                                style = MaterialTheme.typography.labelMedium,

                                color = MaterialTheme.colorScheme.surfaceBright, fontWeight = FontWeight.Normal
                            )
                        }
                    }


                }

                Icon(
                    painter = painterResource(R.drawable.call),
                    contentDescription = "",
                    modifier = Modifier
                        .clip(CircleShape)
                        .background(color = MaterialTheme.colorScheme.surface)
                        .padding(8.dp).clickable { onCall() }, tint = MaterialTheme.colorScheme.primary
                )

            }


            Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp),
                shape = MaterialTheme.shapes.small,
                color = MaterialTheme.colorScheme.primaryContainer
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier

                        .padding(horizontal = 8.dp, vertical = 4.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {

                    Row(verticalAlignment = Alignment.CenterVertically) {
                        IconComp(
                            icon = R.drawable.calendar,
                            size = 18.dp
                        )
                        Spacer(modifier = Modifier.padding(4.dp))
                        Text(date, style = MaterialTheme.typography.labelMedium)
                    }
                    VerticalDivider(modifier = Modifier.height(20.dp))
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        IconComp(
                            icon = R.drawable.clock,
                            size = 18.dp
                        )
                        Spacer(modifier = Modifier.padding(4.dp))

                        Text(date, style = MaterialTheme.typography.labelMedium)
                    }
                }
            }
        }


    }

}


@Preview(showSystemUi = true)
@Composable
fun PrevAppointment(modifier: Modifier = Modifier) {

    Surface(modifier = Modifier.safeContentPadding()) {

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
