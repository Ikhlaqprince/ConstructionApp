// ConstructionApp.kt
package com.example.constructionapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import com.google.firebase.FirebaseApp
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.auth.FirebaseAuth

@HiltAndroidApp
class ConstructionApp : Application() {
    override fun onCreate() {
        super.onCreate()
        FirebaseApp.initializeApp(this)
    }

    companion object {
        val db: FirebaseFirestore by lazy {
            FirebaseFirestore.getInstance()
        }
        val auth: FirebaseAuth by lazy {
            FirebaseAuth.getInstance()
        }
    }
}
