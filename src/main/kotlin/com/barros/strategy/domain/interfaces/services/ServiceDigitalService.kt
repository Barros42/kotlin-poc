package com.barros.strategy.domain.interfaces.services

interface ServiceDigitalService {
    fun getPreferredMessageChannelByUserId(userId: String): Int
}