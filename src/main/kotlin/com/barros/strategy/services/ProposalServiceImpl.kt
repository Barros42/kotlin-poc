package com.barros.strategy.services

import com.barros.strategy.domain.interfaces.services.ProposalService
import com.barros.strategy.domain.model.ProposalModel
import org.springframework.stereotype.Service

@Service
class ProposalServiceImpl: ProposalService {
    override fun getProposalById(proposalId: String): ProposalModel {
        return ProposalModel(
                proposalId,
                "1234567890"
        );
    }

}