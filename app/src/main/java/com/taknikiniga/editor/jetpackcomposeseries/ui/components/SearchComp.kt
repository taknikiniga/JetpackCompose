package com.taknikiniga.editor.jetpackcomposeseries.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.taknikiniga.editor.jetpackcomposeseries.R

@Composable
fun SearchComp(
    modifier: Modifier = Modifier,
    icon: Int,
    value: String,
    onValueChange: (String) -> Unit
) {

    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {

        OutlinedTextField(value = value,
            onValueChange = onValueChange,
            leadingIcon = {
                IconComp(icon = icon)
            }, label = {
                Text("Search")
            })
        Spacer(modifier = Modifier.padding(8.dp))
        Surface(
            border = BorderStroke(1.dp, MaterialTheme.colorScheme.surfaceVariant),
            modifier = Modifier.size(56.dp),
            color = MaterialTheme.colorScheme.primary,
            shape = MaterialTheme.shapes.medium
        ) {
            IconComp(
                icon = icon,
                modifier = Modifier.padding(18.dp),
                tintColor = MaterialTheme.colorScheme.surface
            )

        }
    }

}

@Preview(showSystemUi = true)
@Composable
private fun SearchCompPrev() {
    SearchComp(icon = R.drawable.search, value = "", onValueChange = {})
}