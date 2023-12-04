package com.barros.strategy.domain.templates

import com.barros.strategy.domain.templates.email.EmailTemplates

class MessageTemplates {
    companion object {
        val email = EmailTemplates();
    }
}