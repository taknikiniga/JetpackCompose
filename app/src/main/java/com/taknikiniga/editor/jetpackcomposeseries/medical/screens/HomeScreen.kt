package com.taknikiniga.editor.jetpackcomposeseries.medical.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
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
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.taknikiniga.editor.jetpackcomposeseries.R
import com.taknikiniga.editor.jetpackcomposeseries.medical.data.Data
import com.taknikiniga.editor.jetpackcomposeseries.ui.components.Appointment
import com.taknikiniga.editor.jetpackcomposeseries.ui.components.BlogCard
import com.taknikiniga.editor.jetpackcomposeseries.ui.components.DiseaseCard
import com.taknikiniga.editor.jetpackcomposeseries.ui.components.HeaderComp
import com.taknikiniga.editor.jetpackcomposeseries.ui.components.SearchComp
import com.taknikiniga.editor.jetpackcomposeseries.ui.components.SeeMoreComp


@Preview(showSystemUi = true)
@Composable
fun HomeScreen(modifier: Modifier = Modifier) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {



        LazyColumn(verticalArrangement = Arrangement.spacedBy(16.dp)) {

            item {
                SeeMoreComp(
                    title = "Upcoming Schedule",
                    hasCount = true,
                    count = 2,
                    onClick = {},
                    shape = CircleShape
                )
                Spacer(modifier = Modifier.padding(8.dp))
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

            item {

                /*Doctor Speciality*/
                SeeMoreComp(
                    title = "Doctor Speciality",
                    onClick = {},
                    shape = CircleShape
                )
                Spacer(modifier = Modifier.padding(8.dp))

                LazyRow(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    items(Data.diseaseData) {
                        DiseaseCard(icon = it.icon, title = it.diseaseName)
                    }
                }
            }

            item {
                /*Doctor Speciality*/
                SeeMoreComp(
                    title = "Nearby Hospitals",
                    onClick = {},
                    shape = CircleShape
                )
                Spacer(modifier = Modifier.padding(8.dp))
                LazyRow(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    items(Data.medicalBlogs) {
                        BlogCard(
                            img = it.thumbnailUrl,
                            rating = it.rating,
                            ratingIcon = 0,
                            title = it.title,
                            description = it.description,

                            modifier = Modifier
                                .width(250.dp)
                                .height(200.dp).padding(5.dp),
                            background = MaterialTheme.colorScheme.primaryContainer
                        )
                    }
                }
            }

        }

    }

}

