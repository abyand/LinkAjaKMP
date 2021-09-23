package com.linkaja.inbox.abstraction.datasource

import com.linkaja.inbox.model.CategoryInbox
import com.linkaja.inbox.model.Inbox
import com.linkaja.inbox.model.RequestCategoryInboxStatus
import com.linkaja.inbox.model.RequestInboxCollectionStatus

interface InboxLocalDataSource {

    suspend fun getCategoryInbox(): RequestCategoryInboxStatus

    suspend fun cacheCategoryInboxCollection(data: List<CategoryInbox>)

    suspend fun cacheListInboxCollection(page: Int, data: List<Inbox>, idCategory: Int)

    suspend fun getListInbox(idCategory: Int, page: Int): RequestInboxCollectionStatus

    suspend fun clearInboxCollection()
}