package com.barros.strategy.builders

import com.barros.strategy.controllers.dtos.NewEventInput
import com.barros.strategy.domain.enums.PreferredMessageChannel
import com.barros.strategy.domain.interfaces.services.ProposalService
import com.barros.strategy.domain.interfaces.services.ServiceDigitalService
import com.barros.strategy.domain.model.ProposalModel
import com.barros.strategy.strategies.EmailStrategyImpl
import com.barros.strategy.strategies.MessageStrategyImpl
import com.barros.strategy.strategies.SmsStrategyImpl
import com.barros.strategy.strategies.WhatsAppStrategyImpl
import org.springframework.stereotype.Service

@Service
class MessageContext(
        val proposalService: ProposalService,
        val serviceDigitalService: ServiceDigitalService,
        val emailStrategyImpl: EmailStrategyImpl,
        val whatsAppStrategyImpl: WhatsAppStrategyImpl,
        val smsStrategyImpl: SmsStrategyImpl
) {

    fun buildStrategy(input: NewEventInput): MessageStrategyImpl {
        val proposal = proposalService.getProposalById(input.proposalId);
        val preferredChannel = serviceDigitalService.getPreferredMessageChannelByUserId(proposal.userId);
        return getStrategyByPreferredChannel(input, preferredChannel, proposal);
    }

    fun getStrategyByPreferredChannel(input: NewEventInput, preferredChannel: Int, proposalModel: ProposalModel): MessageStrategyImpl {
        return when(preferredChannel) {
            PreferredMessageChannel.EMAIL.value -> emailStrategyImpl;
            PreferredMessageChannel.WHATSAPP.value -> whatsAppStrategyImpl;
            PreferredMessageChannel.SMS.value -> smsStrategyImpl;
            else -> {
                TODO("Not yet implemented")
            }
        }
    }

}