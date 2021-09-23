package com.linkaja.inbox.model

data class GiftCardDetail(
    val imageCard: String,
    val imageEnvelope: String,
    val title: String,
    val amount: String,
    val header: String,
    val messageBody: String,
    val footer: String,
    val senderName: String,
    val info: String
)