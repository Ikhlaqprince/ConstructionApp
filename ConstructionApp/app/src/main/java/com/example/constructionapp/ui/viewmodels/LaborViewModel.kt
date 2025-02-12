// LaborViewModel.kt
package com.example.constructionapp.ui.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.constructionapp.data.repository.LaborRepository
import kotlinx.coroutines.tasks.await

class LaborViewModel(private val repository: LaborRepository) : ViewModel() {
    fun getLaborBySite(siteId: String) = liveData {
        emit(repository.getLaborBySite(siteId).await().documents.map { it.toObject(Labor::class.java) })
    }
}
