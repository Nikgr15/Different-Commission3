package ru.netology

import org.junit.Assert.assertEquals
import org.junit.Test

class MainKtTest {
    @Test
    fun commissionVkPay() {
        val card = "VkPay"
        val transfers = 1_000
        val monthTransfers = 0
        val mastercardMaestroCommission = 0.06
        val visaMirCommission = 0.075

        val result = commission(
            card = card,
            transfers = transfers,
            monthTransfers = monthTransfers,
            mastercardMaestroCommission = mastercardMaestroCommission,
            visaMirCommission = visaMirCommission
        )
        assertEquals(result, 0)
    }

    @Test
    fun commissionMastercardMaestro() {
        val card2 = "Mastercard"
        val transfers = 5_000
        val monthTransfers = 80_000
        val mastercardMaestroCommission = 0.06
        val visaMirCommission = 0.075

        val result = commission(
            card = card2,
            transfers = transfers,
            monthTransfers = monthTransfers,
            mastercardMaestroCommission = mastercardMaestroCommission,
            visaMirCommission = visaMirCommission
        )
        assertEquals(result, 32_000)
    }

    @Test
    fun commissionVisaMir() {
        val card4 = "Mir"
        val transfers = 5_000
        val monthTransfers = 80_000
        val mastercardMaestroCommission = 0.06
        val visaMirCommission = 0.075

        val result = commission(
            card = card4,
            transfers = transfers,
            monthTransfers = monthTransfers,
            mastercardMaestroCommission = mastercardMaestroCommission,
            visaMirCommission = visaMirCommission
        )
        assertEquals(result, 37_500)
    }

    @Test
    fun commission_If() {
        val card1 = "Maestro"
        val transfers = 10_000
        val monthTransfers = 90_000
        val mastercardMaestroCommission = 0.06
        val visaMirCommission = 0.075

        val result = commission(
            card = card1,
            transfers = transfers,
            monthTransfers = monthTransfers,
            mastercardMaestroCommission = mastercardMaestroCommission,
            visaMirCommission = visaMirCommission
        )
        assertEquals(result, 62000)
    }
}