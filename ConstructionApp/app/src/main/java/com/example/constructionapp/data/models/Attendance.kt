// Attendance.kt
package com.example.constructionapp.data.models

data class Attendance(
    val id: String = "",
    val laborId: String = "",
    val siteId: String = "",
    val date: String = "",
    val status: String = "Present"
)
