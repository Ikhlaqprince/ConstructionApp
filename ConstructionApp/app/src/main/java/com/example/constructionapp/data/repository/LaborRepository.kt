// LaborRepository.kt
package com.example.constructionapp.data.repository

import com.example.constructionapp.ConstructionApp
import com.example.constructionapp.data.models.Labor

class LaborRepository {
    fun addLabor(labor: Labor) {
        ConstructionApp.db.collection("labor").document(labor.id).set(labor)
    }

    fun getLaborBySite(siteId: String) =
        ConstructionApp.db.collection("labor").whereEqualTo("siteId", siteId).get()
}
