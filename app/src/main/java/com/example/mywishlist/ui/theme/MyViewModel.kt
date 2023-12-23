package com.example.mywishlist.ui.theme

import androidx.lifecycle.ViewModel
import com.example.mywishlist.Data.Item
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

data class UiState(
    val selectedItem: Item? = null
)

class MyViewModel : ViewModel() {
    private var _uiState = MutableStateFlow(UiState())
    val uiState: StateFlow<UiState> = _uiState.asStateFlow()

    fun onItemSelected(item: Item) {
        //_uiState.update { UiState(selectedItem = item) } or
        _uiState.value = UiState(selectedItem = item)
    }
}