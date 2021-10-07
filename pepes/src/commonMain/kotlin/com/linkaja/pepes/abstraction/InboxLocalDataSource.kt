package com.linkaja.pepes.abstraction

import com.linkaja.pepes.model.CategoryInbox
import com.linkaja.pepes.model.Inbox
import com.linkaja.pepes.model.RequestCategoryInboxStatus
import com.linkaja.pepes.model.RequestInboxCollectionStatus

interface InboxLocalDataSource {

    suspend fun getCategoryInbox(): RequestCategoryInboxStatus

}