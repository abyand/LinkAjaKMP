package com.linkaja.inbox.model

sealed class RequestCategoryInboxStatus {
    abstract val data: List<CategoryInbox>
    data class SuccessLocal(
        override val data: List<CategoryInbox>
    ) : RequestCategoryInboxStatus()

    data class SuccessRemote(
        override val data: List<CategoryInbox>
    ) : RequestCategoryInboxStatus()
}