package com.taknikiniga.editor.jetpackcomposeseries.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.taknikiniga.editor.jetpackcomposeseries.R

@Composable
fun DiseaseCard(modifier: Modifier = Modifier, icon: Int, title: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        IconComp(
            icon = icon,
            clip = true,
            shape = CircleShape,
            backgroundColor = MaterialTheme.colorScheme.primaryContainer,
            iconModifier = Modifier.padding(10.dp), size = 50.dp
        )
        Spacer(modifier = Modifier.padding(2.dp))
        Text(title, style = MaterialTheme.typography.labelSmall)
    }
}

@Preview
@Composable
private fun DiseaseCardPre() {
    DiseaseCard(icon = R.drawable.heart, title = "Heart Disease")

}