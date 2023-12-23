package com.example.mywishlist.ui.Screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.mywishlist.Data.FakeRepository
import com.example.mywishlist.Data.Item
import com.example.mywishlist.Data.Priority

@Composable
fun ListingScreen(
    onItemSelected: (Item) -> Unit,
) {
    val wishList = FakeRepository().getItems()
    LazyColumn(
        modifier = Modifier.padding(16.dp)
    ) {
        item {
            Text(
                text = "My WishList",
                style = MaterialTheme.typography.headlineLarge
            )
        }
        items(wishList) { item ->
            ItemCard(item = item, onClick = { onItemSelected(item) })
        }
    }
}

fun onItemSelected(item: Item) {

}

@OptIn(ExperimentalMaterial3Api::class, ExperimentalGlideComposeApi::class)
@Composable
fun ItemCard(item: Item, onClick: () -> Unit) {
    Card(
        onClick = onClick,
        colors = CardDefaults.cardColors(
            containerColor = when (item.priority) {
                Priority.High -> Color.Red.copy(alpha = 0.2f)
                Priority.Medium -> Color.Green.copy(alpha = 0.2f)
                Priority.Low -> Color.Blue.copy(alpha = 0.2f)
            }
        )
    ) {
        if (item.isImgLocal) {
            GlideImage(
                model = item.imgLocal,
                contentDescription = item.title,
                contentScale = ContentScale.Crop,
                modifier = Modifier.height(250.dp)
            )
        } else {
            GlideImage(
                model = item.img,
                contentDescription = item.title,
                contentScale = ContentScale.Crop,
                modifier = Modifier.height(250.dp)
            )
        }
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = item.title)
            Text(text = item.website, style = MaterialTheme.typography.bodySmall)
        }
    }

}
