package com.barros.strategy.services

import com.barros.strategy.domain.interfaces.services.EmailMessageService
import org.springframework.stereotype.Service

@Service
class EmailMessageServiceImpl: EmailMessageService {

    override fun sendEmailMessageRequest(template: String) {
        println("Enviando Email");
        println(template);
    }

}