package com.barros.strategy.strategies

import com.barros.strategy.controllers.dtos.NewEventInput
import com.barros.strategy.domain.enums.ProposalStatus
import com.barros.strategy.usecases.email.BaseUseCase
import com.barros.strategy.usecases.email.SendProposalApprovedEmailUseCaseImpl
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class EmailStrategyImpl(
        @Autowired private val sendProposalApprovedEmailUseCaseImpl: SendProposalApprovedEmailUseCaseImpl
) : MessageStrategyImpl() {

    override fun use(input: NewEventInput) {
        println("Using EmailStrategyImpl")
        val useCase = getUseCase(input.proposalStatus);
        return useCase.run(input)
    }

    fun getUseCase(triggerStatus: Int): BaseUseCase {
        return when(triggerStatus) {
            ProposalStatus.PROPOSTA_APROVADA.value -> sendProposalApprovedEmailUseCaseImpl
            else -> {
                TODO("Not yet implemented")
            }
        }
    }
}