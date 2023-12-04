package com.barros.strategy.domain.enums

enum class ProposalStatus(val value: Int) {
    PROPOSTA_RECEBIDA(1),
    PROPOSTA_RECUSADA(12),
    PROPOSTA_APROVADA(15);

    companion object {
        fun fromInt(value: Int) = ProposalStatus.values().first { it.value == value }
    }
}