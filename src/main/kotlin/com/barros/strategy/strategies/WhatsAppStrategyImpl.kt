package com.barros.strategy.strategies

import com.barros.strategy.controllers.dtos.NewEventInput
import org.springframework.stereotype.Service

@Service
class WhatsAppStrategyImpl : MessageStrategyImpl() {
    override fun use(input: NewEventInput) {
        TODO("Not yet implemented")
    }
}