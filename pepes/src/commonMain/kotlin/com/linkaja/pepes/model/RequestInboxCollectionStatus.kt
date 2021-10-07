package com.linkaja.pepes.model

sealed class RequestInboxCollectionStatus {
    data class SuccessLocal(
        val total_page: Int,
        val data: List<Inbox>
    ) : RequestInboxCollectionStatus()

    data class SuccessRemote(
        val total_page: Int,
        val page: Int,
        val data: List<Inbox>
    ) : RequestInboxCollectionStatus()
}