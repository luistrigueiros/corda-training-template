package net.corda.training.state

import net.corda.core.contracts.Amount
import net.corda.core.contracts.ContractState
import net.corda.core.identity.Party
import net.corda.finance.POUNDS
import java.util.*

/**
 * This is where you'll add the definition of your state object. Look at the unit tests in [IOUStateTests] for
 * instructions on how to complete the [IOUState] class.
 *
 * Remove the "val data: String = "data" property before starting the [IOUState] tasks.
 */
data class IOUState(val amount: Amount<Currency>,
                    val lender:Party,
                    val borrower:Party,
                    val paid:Amount<Currency> = 0.POUNDS): ContractState {
    override val participants: List<Party> get() = listOf(lender, borrower)
}