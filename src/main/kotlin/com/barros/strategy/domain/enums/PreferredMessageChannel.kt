package com.barros.strategy.domain.enums

enum class PreferredMessageChannel(val value: Int) {
    EMAIL(1),
    SMS(2),
    WHATSAPP(3);

    companion object {
        fun fromInt(value: Int) = PreferredMessageChannel.values().first { it.value == value }
    }
}