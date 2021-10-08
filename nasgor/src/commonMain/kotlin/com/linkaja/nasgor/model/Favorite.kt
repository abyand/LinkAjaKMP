package com.linkaja.nasgor.model

data class Favorite(
    val id: Int,
    val bankCode: String,
    val bankName: String,
    val menuId: String,
    val menuName: String,
    val categoryId: Int,
    val imageUrl: String,
    val description: String,
    val customerNumber: String
)