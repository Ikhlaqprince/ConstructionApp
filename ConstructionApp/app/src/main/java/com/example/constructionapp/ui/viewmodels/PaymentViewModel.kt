// PaymentViewModel.kt
package com.example.constructionapp.ui.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.constructionapp.data.repository.PaymentRepository
import kotlinx.coroutines.tasks.await

class PaymentViewModel(private val repository: PaymentRepository) : ViewModel() {
    fun getPaymentsBySite(siteId: String) = liveData {
        emit(repository.getPaymentsBySite(siteId).await().documents.map { it.toObject(Payment::class.java) })
    }
}
