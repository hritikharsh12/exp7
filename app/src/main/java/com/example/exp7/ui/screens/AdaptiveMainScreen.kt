package com.example.exp7.ui.screens

import androidx.activity.compose.BackHandler
import androidx.compose.material3.adaptive.ExperimentalMaterial3AdaptiveApi
import androidx.compose.material3.adaptive.layout.AnimatedPane
import androidx.compose.material3.adaptive.layout.ListDetailPaneScaffold
import androidx.compose.material3.adaptive.layout.ListDetailPaneScaffoldRole
import androidx.compose.material3.adaptive.navigation.rememberListDetailPaneScaffoldNavigator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.example.exp7.model.GalleryItem
import com.example.exp7.model.SampleData
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3AdaptiveApi::class)
@Composable
fun AdaptiveMainScreen(
    modifier: Modifier = Modifier
) {
    val coroutineScope = rememberCoroutineScope()
    val items = remember {
        mutableStateListOf<GalleryItem>().apply {
            addAll(SampleData.items)
        }
    }

    var selectedItem by remember { mutableStateOf<GalleryItem?>(items.firstOrNull()) }
    val navigator = rememberListDetailPaneScaffoldNavigator<String>()

    BackHandler(enabled = navigator.canNavigateBack()) {
        coroutineScope.launch {
            navigator.navigateBack()
        }
    }

    val onFavoriteToggle: (GalleryItem) -> Unit = { targetItem ->
        val index = items.indexOfFirst { it.id == targetItem.id }
        if (index != -1) {
            val updated = items[index].copy(isFavorite = !items[index].isFavorite)
            items[index] = updated
            if (selectedItem?.id == targetItem.id) {
                selectedItem = updated
            }
        }
    }

    ListDetailPaneScaffold(
        directive = navigator.scaffoldDirective,
        value = navigator.scaffoldValue,
        listPane = {
            AnimatedPane {
                ItemListPane(
                    items = items,
                    selectedItemId = selectedItem?.id,
                    onItemSelected = { item ->
                        selectedItem = item
                        coroutineScope.launch {
                            navigator.navigateTo(ListDetailPaneScaffoldRole.Detail)
                        }
                    },
                    onFavoriteToggle = onFavoriteToggle
                )
            }
        },
        detailPane = {
            AnimatedPane {
                ItemDetailPane(
                    item = selectedItem,
                    showBackButton = navigator.canNavigateBack(),
                    onBackClick = {
                        coroutineScope.launch {
                            navigator.navigateBack()
                        }
                    },
                    onFavoriteToggle = onFavoriteToggle
                )
            }
        },
        modifier = modifier
    )
}
