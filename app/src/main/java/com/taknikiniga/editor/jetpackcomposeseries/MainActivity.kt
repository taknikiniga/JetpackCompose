package com.taknikiniga.editor.jetpackcomposeseries

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.taknikiniga.editor.jetpackcomposeseries.medical.data.Data
import com.taknikiniga.editor.jetpackcomposeseries.medical.screens.HomeScreen
import com.taknikiniga.editor.jetpackcomposeseries.ui.components.HeaderComp
import com.taknikiniga.editor.jetpackcomposeseries.ui.components.IconComp
import com.taknikiniga.editor.jetpackcomposeseries.ui.components.SearchComp
import com.taknikiniga.editor.jetpackcomposeseries.ui.theme.JetpackComposeSeriesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeSeriesTheme() {
                var isExpended by remember { mutableStateOf(false) }
                var (isSelected, onSelected) = remember {
                    mutableStateOf(Data.bottomMenu[0])
                }

                Scaffold(modifier = Modifier.fillMaxSize(), topBar = {

                    Column(modifier = Modifier.padding(16.dp, top = 16.dp, end = 16.dp)) {
                        HeaderComp(
                            title = "Location",
                            location = "New Delhi, INDIA",
                            onExpand = {},
                            modifier = Modifier,
                            expandIcon = if (isExpended) R.drawable.expand_arrow else R.drawable.expand_arrow,
                            onNotifyClick = {},
                            isExpended = isExpended,
                            notifyIcon = R.drawable.notification,
                            locationIcon = R.drawable.location,
                        )
                        Spacer(modifier = Modifier.padding(4.dp))
                        SearchComp(value = "", onValueChange = {})
                    }
                }, bottomBar = {
                    BottomAppBar {
                        Data.bottomMenu.forEach {
                            NavigationBarItem(selected = isSelected == it, onClick = {
                                onSelected(it)
                            }, icon = {
                                IconComp(icon = it.icon, onClick = {
                                    onSelected(it)
                                })
                            }, label = {
                                Text(it.title)
                            })
                        }
                    }
                }) { innerPadding ->
                    HomeScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}




