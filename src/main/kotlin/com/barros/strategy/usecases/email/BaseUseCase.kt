package com.barros.strategy.usecases.email

import com.barros.strategy.controllers.dtos.NewEventInput

abstract class BaseUseCase() {
    abstract fun run(input: NewEventInput)
}