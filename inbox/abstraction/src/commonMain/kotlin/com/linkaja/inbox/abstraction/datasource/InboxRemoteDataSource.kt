package com.linkaja.inbox.abstraction.datasource

import com.linkaja.inbox.model.Inbox
import com.linkaja.inbox.model.Language
import com.linkaja.inbox.model.RequestCategoryInboxStatus
import com.linkaja.inbox.model.RequestInboxCollectionStatus

interface InboxRemoteDataSource {
    suspend fun fetchCategoryInbox(
        msisdn: String,
        language: Language
    ): RequestCategoryInboxStatus

    suspend fun markReadAllInbox(
        msisdn: String,
        param:Int
    )

    suspend fun fetchListInbox(
        msisdn: String,
        idCategory: Int,
        page: Int,
        limit: Int): RequestInboxCollectionStatus

    suspend fun markReadInbox(
        inbox: Inbox
    )
}