// ConstructionSiteViewModel.kt
package com.example.constructionapp.ui.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.constructionapp.data.repository.ConstructionSiteRepository
import kotlinx.coroutines.tasks.await

class ConstructionSiteViewModel(private val repository: ConstructionSiteRepository) : ViewModel() {
    fun getSites() = liveData {
        emit(repository.getSites().await().documents.map { it.toObject(ConstructionSite::class.java) })
    }
}
