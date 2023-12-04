package com.barros.strategy.controllers

import com.barros.strategy.builders.MessageContext
import com.barros.strategy.controllers.dtos.NewEventInput
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/events")
class NewEventController(
        private val messageContext: MessageContext
) {

    @PostMapping
    fun newEvent(@RequestBody input: NewEventInput): NewEventInput {
        val strategy = messageContext.buildStrategy(input);
        strategy.use(input);
        return input
    }

}