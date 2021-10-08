package com.linkaja.nasgor.abstraction

import com.linkaja.nasgor.model.Language
import com.linkaja.nasgor.model.StatusFavorite

interface KMPFavoriteRemoteDataSource {
    suspend fun getFavoriteListByCategory(
        language: Language,
        page: Int,
        limit: Int,
        categoryId: Int
    ): StatusFavorite
}