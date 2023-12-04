package com.barros.strategy.domain.interfaces.services

interface EmailMessageService {
    fun sendEmailMessageRequest(template: String)
}