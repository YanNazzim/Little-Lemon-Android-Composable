package com.example.littlelemon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.littlelemon.ui.theme.LittleLemonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LittleLemonTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // Pass the resource ID directly without converting to String
                    RestaurantName(R.string.title, 24)
                }
            }
        }
    }
}

@Composable
fun RestaurantName(nameResId: Int, size : Int) {
    // Retrieve the string resource using the provided ID
    val name = stringResource(id = nameResId)
    Text(
        text = "The restaurant's name is: $name",
        modifier = Modifier.padding(16.dp),
        fontSize = size.sp
    )
}


@Preview(showBackground = true)
@Composable
fun RestaurantNamePreview() {
    LittleLemonTheme {
        RestaurantName(R.string.title, 24)
    }
}

