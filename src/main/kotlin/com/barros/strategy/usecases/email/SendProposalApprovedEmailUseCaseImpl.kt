package com.barros.strategy.usecases.email

import com.barros.strategy.controllers.dtos.NewEventInput
import com.barros.strategy.domain.enums.ProposalEmailTemplates
import com.barros.strategy.domain.interfaces.services.EmailMessageService
import com.barros.strategy.domain.interfaces.services.ProposalService
import com.barros.strategy.domain.model.ProposalModel
import com.barros.strategy.domain.templates.MessageTemplates
import org.springframework.stereotype.Service

@Service
class SendProposalApprovedEmailUseCaseImpl(
        private val emailMessageService: EmailMessageService,
        private val proposalService: ProposalService
) : BaseUseCase() {

    override fun run(input: NewEventInput) {
        println("SendProposalApprovedEmailUseCaseImpl");
        val proposal = proposalService.getProposalById(input.proposalId);
        println("Obtendo proposta -> " + input.proposalId);
        println(proposal);
        emailMessageService.sendEmailMessageRequest(MessageTemplates.email.approved.seg1);
        println("E-mail enviado com sucesso!");
    }
}