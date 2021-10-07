package com.linkaja.pepes.abstraction

import com.linkaja.pepes.model.CategoryInbox
import com.linkaja.pepes.model.Inbox
import com.linkaja.pepes.model.RequestCategoryInboxStatus
import com.linkaja.pepes.model.RequestInboxCollectionStatus

interface InboxLocalDataSource {

    suspend fun getCategoryInbox(): RequestCategoryInboxStatus

    suspend fun cacheCategoryInboxCollection(data: List<CategoryInbox>)

    suspend fun cacheListInboxCollection(page: Int, data: List<Inbox>, idCategory: Int)

    suspend fun getListInbox(idCategory: Int, page: Int): RequestInboxCollectionStatus

    suspend fun clearInboxCollection()
}