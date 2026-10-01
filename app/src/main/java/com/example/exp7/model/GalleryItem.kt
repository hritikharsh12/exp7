package com.example.exp7.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CameraRoll
import androidx.compose.material.icons.filled.Explore
import androidx.compose.material.icons.filled.Landscape
import androidx.compose.material.icons.filled.LocationCity
import androidx.compose.material.icons.filled.Nature
import androidx.compose.material.icons.filled.Park
import androidx.compose.ui.graphics.vector.ImageVector

data class GalleryItem(
    val id: String,
    val title: String,
    val subtitle: String,
    val category: String,
    val imageUrl: String,
    val placeholderIcon: ImageVector,
    val description: String,
    val location: String,
    val author: String,
    val dimensions: String,
    val dateAdded: String,
    val isFavorite: Boolean = false
)

object SampleData {
    val categories = listOf("All", "Nature", "Architecture", "Landscapes", "Urban")

    val items = listOf(
        GalleryItem(
            id = "1",
            title = "Mountain Serenity",
            subtitle = "Snow-capped peaks under clear blue sky",
            category = "Nature",
            imageUrl = "https://images.unsplash.com/photo-1464822759023-fed622ff2c3b?auto=format&fit=crop&w=1000&q=80",
            placeholderIcon = Icons.Default.Landscape,
            description = "A breathtaking view of mountain ranges reaching into the clear morning sky. High altitude alpine scenery captured during early winter solstice.",
            location = "Swiss Alps, Switzerland",
            author = "Elena Rostova",
            dimensions = "3840 x 2160",
            dateAdded = "Oct 2026"
        ),
        GalleryItem(
            id = "2",
            title = "Metropolitan Skyline",
            subtitle = "Modern architectural towers at twilight",
            category = "Architecture",
            imageUrl = "https://images.unsplash.com/photo-1486406146926-c627a92ad1ab?auto=format&fit=crop&w=1000&q=80",
            placeholderIcon = Icons.Default.LocationCity,
            description = "Sleek glass skyscrapers reflecting the golden hour light in a bustling downtown commercial district.",
            location = "Tokyo, Japan",
            author = "Kenji Sato",
            dimensions = "4096 x 2304",
            dateAdded = "Sep 2026"
        ),
        GalleryItem(
            id = "3",
            title = "Forest Canopy Path",
            subtitle = "Sunbeams filtering through dense pine foliage",
            category = "Nature",
            imageUrl = "https://images.unsplash.com/photo-1448375240586-882707db888b?auto=format&fit=crop&w=1000&q=80",
            placeholderIcon = Icons.Default.Park,
            description = "A peaceful walking path winding through an ancient pine forest with morning light cascading down between high branches.",
            location = "Black Forest, Germany",
            author = "Marcus Vance",
            dimensions = "3000 x 2000",
            dateAdded = "Sep 2026"
        ),
        GalleryItem(
            id = "4",
            title = "Golden Desert Dunes",
            subtitle = "Rolling sand dunes stretched to the horizon",
            category = "Landscapes",
            imageUrl = "https://images.unsplash.com/photo-1509316975850-ff9c5deb0cd9?auto=format&fit=crop&w=1000&q=80",
            placeholderIcon = Icons.Default.Explore,
            description = "Sculpted ridges formed by winds blowing across vast desert expanse at sunset, highlighting rich copper hues.",
            location = "Sahara, Morocco",
            author = "Amina Tariq",
            dimensions = "5120 x 2880",
            dateAdded = "Aug 2026"
        ),
        GalleryItem(
            id = "5",
            title = "Coastal Wave Motion",
            subtitle = "Dramatic ocean waves crashing against sea cliffs",
            category = "Landscapes",
            imageUrl = "https://images.unsplash.com/photo-1507525428034-b723cf961d3e?auto=format&fit=crop&w=1000&q=80",
            placeholderIcon = Icons.Default.Nature,
            description = "Dynamic long-exposure coastal photography capturing powerful waves receding over smooth pebble shorelines.",
            location = "Big Sur, California",
            author = "Chloe Bennett",
            dimensions = "4000 x 2667",
            dateAdded = "Jul 2026"
        ),
        GalleryItem(
            id = "6",
            title = "Neon Night Alley",
            subtitle = "Vibrant neon glow reflecting on rain-slicked streets",
            category = "Urban",
            imageUrl = "https://images.unsplash.com/photo-1514565131-fce0801e5785?auto=format&fit=crop&w=1000&q=80",
            placeholderIcon = Icons.Default.CameraRoll,
            description = "An atmospheric nocturnal view down an urban alleyway illuminated by colorful signs and wet pavement reflections.",
            location = "Seoul, South Korea",
            author = "Min-ho Park",
            dimensions = "3840 x 2160",
            dateAdded = "Jun 2026"
        )
    )
}
