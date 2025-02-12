// AttendanceViewModel.kt
package com.example.constructionapp.ui.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.constructionapp.data.repository.AttendanceRepository
import kotlinx.coroutines.tasks.await

class AttendanceViewModel(private val repository: AttendanceRepository) : ViewModel() {
    fun getAttendanceBySite(siteId: String) = liveData {
        emit(repository.getAttendanceBySite(siteId).await().documents.map { it.toObject(Attendance::class.java) })
    }
}
