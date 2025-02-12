// ViewModelFactory.kt
package com.example.constructionapp.ui.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ViewModelFactory<T>(private val repository: Any, private val creator: (Any) -> T) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return creator(repository) as T
    }
}
