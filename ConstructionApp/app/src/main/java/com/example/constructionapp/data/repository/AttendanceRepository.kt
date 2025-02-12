// AttendanceRepository.kt
package com.example.constructionapp.data.repository

import com.example.constructionapp.ConstructionApp
import com.example.constructionapp.data.models.Attendance

class AttendanceRepository {
    fun markAttendance(attendance: Attendance) {
        ConstructionApp.db.collection("attendance").document(attendance.id).set(attendance)
    }

    fun getAttendanceBySite(siteId: String) =
        ConstructionApp.db.collection("attendance").whereEqualTo("siteId", siteId).get()
}