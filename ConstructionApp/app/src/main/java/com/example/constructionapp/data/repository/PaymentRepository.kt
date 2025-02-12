// PaymentRepository.kt
package com.example.constructionapp.data.repository

import com.example.constructionapp.ConstructionApp
import com.example.constructionapp.data.models.Payment

class PaymentRepository {
    fun addPayment(payment: Payment) {
        ConstructionApp.db.collection("payments").document(payment.id).set(payment)
    }

    fun getPaymentsBySite(siteId: String) =
        ConstructionApp.db.collection("payments").whereEqualTo("siteId", siteId).get()
}