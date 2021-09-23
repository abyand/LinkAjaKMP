package com.linkaja.inbox.model

sealed class Inbox {

    abstract val id: String
    abstract val title: String
    abstract val message: String
    abstract val content: String
    abstract val status: Status
    abstract val datetime: Long
    abstract val imageUrl: String

    data class Info(
        override val id: String,
        override val title: String,
        override val message: String,
        override val content: String,
        override val status: Status,
        override val datetime: Long,
        override val imageUrl: String
    ) : Inbox()

    data class Promo(
        override val id: String,
        override val title: String,
        override val message: String,
        override val content: String,
        override val status: Status,
        override val datetime: Long,
        override val imageUrl: String,
        val payload:String
    ) : Inbox()

    data class Reminder(
        override val id: String,
        override val title: String,
        override val message: String,
        override val content: String,
        override val status: Status,
        override val datetime: Long,
        override val imageUrl: String,
        val payload:String
    ) : Inbox()

    data class GiftCard(
        override val id: String,
        override val title: String,
        override val message: String,
        override val content: String,
        override val status: Status,
        override val datetime: Long,
        override val imageUrl: String,
        val payload:String
    ) : Inbox()


    data class WebView(
        override val id: String,
        override val title: String,
        override val message: String,
        override val content: String,
        override val status: Status,
        override val datetime: Long,
        override val imageUrl: String,
        val url:String
    ) : Inbox()

    data class Deeplink(
        override val id: String,
        override val title: String,
        override val message: String,
        override val content: String,
        override val status: Status,
        override val datetime: Long,
        override val imageUrl: String,
        val url:String
    ) : Inbox()

    enum class Status {
        UNREAD,
        READ;
        companion object{
            fun get(param: String?): Status {
                return if(param=="READ") READ
                else UNREAD
            }
        }
    }
}