package com.linkaja.nasgor.model

sealed class StatusFavorite {
    data class Success(val data: List<Favorite>) : StatusFavorite()
    object Empty : StatusFavorite()
    object Error : StatusFavorite()
    object Init : StatusFavorite()
    object Maintenance : StatusFavorite()
    object Offline : StatusFavorite()
}