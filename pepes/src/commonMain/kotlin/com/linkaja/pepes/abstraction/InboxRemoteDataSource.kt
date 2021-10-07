package com.linkaja.pepes.abstraction

import com.linkaja.pepes.model.Inbox
import com.linkaja.pepes.model.Language
import com.linkaja.pepes.model.RequestCategoryInboxStatus
import com.linkaja.pepes.model.RequestInboxCollectionStatus


interface InboxRemoteDataSource {

    suspend fun fetchCategoryInbox(
        msisdn: String,
        language: Language
    ): RequestCategoryInboxStatus

}