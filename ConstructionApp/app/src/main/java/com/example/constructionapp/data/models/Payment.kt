// Payment.kt
package com.example.constructionapp.data.models

data class Payment(
    val id: String = "",
    val laborId: String = "",
    val siteId: String = "",
    val amount: Double = 0.0,
    val date: String = ""
)
