package com.barros.strategy.services

import com.barros.strategy.domain.enums.PreferredMessageChannel
import com.barros.strategy.domain.interfaces.services.ServiceDigitalService
import org.springframework.stereotype.Service

@Service
class ServiceDigitalServiceImpl: ServiceDigitalService {
    override fun getPreferredMessageChannelByUserId(userId: String): Int {
        return PreferredMessageChannel.EMAIL.value; // Mocked
    }
}