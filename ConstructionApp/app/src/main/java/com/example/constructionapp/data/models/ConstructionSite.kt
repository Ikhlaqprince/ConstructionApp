// ConstructionSite.kt
package com.example.constructionapp.data.models

data class ConstructionSite(
    val id: String = "",
    val name: String = "",
    val location: String = "",
    val startDate: String = "",
    val endDate: String? = null
)