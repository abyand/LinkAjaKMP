package com.linkaja.inbox.abstraction.repository

import com.linkaja.inbox.model.Inbox
import com.linkaja.inbox.model.Language
import com.linkaja.inbox.model.RequestCategoryInboxStatus
import com.linkaja.inbox.model.RequestInboxCollectionStatus
import kotlinx.coroutines.flow.Flow


interface InboxRepository {

    suspend fun requestCategoryInbox(
        msisdn: String,
        language: Language
    ): Flow<RequestCategoryInboxStatus>

    suspend fun requestMarkReadAllInbox(msisdn: String, param: Int)

    suspend fun requestListInbox(
        msisdn: String,
        idCategory: Int,
        page: Int,
        limit: Int
    ): Flow<RequestInboxCollectionStatus>

    suspend fun requestMarkReadInbox(inbox: Inbox)

    suspend fun clearInboxCollection()

    fun parseInbox(
        param: String
    ): Inbox
}