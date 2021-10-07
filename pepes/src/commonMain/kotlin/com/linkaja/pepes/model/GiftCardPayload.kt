package com.linkaja.pepes.model

data class GiftCardPayload(
    val imageCard: String,
    val imageEnvelope: String,
    val title: String,
    val amountBonbal: String,
    val header: String,
    val content: String,
    val footer: String,
    val sender: String,
    val info: String
)
{
        fun toGiftCardDetail(): GiftCardDetail {
            return GiftCardDetail(
                imageCard = imageCard,
                imageEnvelope = imageEnvelope,
                title = title,
                amount = amountBonbal,
                header = header,
                messageBody = content,
                footer = footer,
                senderName = sender,
                info = info,
            )
        }
}