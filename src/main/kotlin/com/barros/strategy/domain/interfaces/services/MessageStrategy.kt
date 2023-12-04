package com.barros.strategy.domain.interfaces.services

import com.barros.strategy.controllers.dtos.NewEventInput

interface MessageStrategy {
    fun use(input: NewEventInput);
}