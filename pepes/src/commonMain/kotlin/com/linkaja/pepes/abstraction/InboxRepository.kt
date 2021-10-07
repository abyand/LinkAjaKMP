package com.linkaja.pepes.abstraction

import com.linkaja.pepes.model.Inbox
import com.linkaja.pepes.model.Language
import com.linkaja.pepes.model.RequestCategoryInboxStatus
import com.linkaja.pepes.model.RequestInboxCollectionStatus
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