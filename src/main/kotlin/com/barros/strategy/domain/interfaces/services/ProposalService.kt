package com.barros.strategy.domain.interfaces.services

import com.barros.strategy.domain.model.ProposalModel

interface ProposalService {
    fun getProposalById(proposalId: String): ProposalModel
}