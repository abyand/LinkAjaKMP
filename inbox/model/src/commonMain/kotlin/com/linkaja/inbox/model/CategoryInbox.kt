package com.linkaja.inbox.model

data class CategoryInbox(
    val idCategory: Int,
    val categoryName: String,
    var countUnread: Int
){
    override fun equals(other: Any?): Boolean {
        if (other is CategoryInbox){
            return idCategory == other.idCategory
        }
        return super.equals(other)
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }
}