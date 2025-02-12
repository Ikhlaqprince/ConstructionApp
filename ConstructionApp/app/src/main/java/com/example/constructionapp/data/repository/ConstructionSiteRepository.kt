// ConstructionSiteRepository.kt
package com.example.constructionapp.data.repository

import com.example.constructionapp.ConstructionApp
import com.example.constructionapp.data.models.ConstructionSite

class ConstructionSiteRepository {
    fun addSite(site: ConstructionSite) {
        ConstructionApp.db.collection("sites").document(site.id).set(site)
    }

    fun getSites() = ConstructionApp.db.collection("sites").get()
}
