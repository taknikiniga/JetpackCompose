package com.taknikiniga.editor.jetpackcomposeseries.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
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
    settingsIcon: Int = R.drawable.settings,
    editorIcon: Int = R.drawable.search,
    value: String,
    onValueChange: (String) -> Unit
) {

    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center, modifier = Modifier.fillMaxWidth()
    ) {

        OutlinedTextField(value = value,
            onValueChange = onValueChange,
            leadingIcon = {
                IconComp(icon = editorIcon)
            }, label = {
                Text("Search")
            }, shape = MaterialTheme.shapes.medium, modifier = Modifier.weight(1f))
        Spacer(modifier = Modifier.padding(2.dp))
        Surface(
            border = BorderStroke(1.dp, MaterialTheme.colorScheme.surfaceVariant),
            modifier = Modifier.size(50.dp),
            color = MaterialTheme.colorScheme.primary,
            shape = MaterialTheme.shapes.medium
        ) {
            IconComp(
                icon = settingsIcon,
                modifier = Modifier.padding(14.dp),
                tintColor = MaterialTheme.colorScheme.surface
            )

        }
    }

}

@Preview(showSystemUi = true)
@Composable
private fun SearchCompPrev() {
    SearchComp(value = "", onValueChange = {})
}