package ru.netology

import org.junit.Assert.assertEquals
import org.junit.Test

class MainKtTest {
    @Test
    fun commissionVkPay() {
        val card = "VkPay"
        val transfers = 1_000
        val MonthTransfers = 0
        val MastercardMaestroCommission = 0.06
        val VisaMirCommission = 0.075

        val result = Commission(
            card = card,
            transfers = transfers,
            MonthTransfers = MonthTransfers,
            MastercardMaestroCommission = MastercardMaestroCommission,
            VisaMirCommission = VisaMirCommission
        )
        assertEquals(result, 0)
    }

    @Test
    fun commissionMastercardMaestro() {
        val card2 = "Mastercard"
        val transfers = 5_000
        val MonthTransfers = 80_000
        val MastercardMaestroCommission = 0.06
        val VisaMirCommission = 0.075

        val result = Commission(
            card = card2,
            transfers = transfers,
            MonthTransfers = MonthTransfers,
            MastercardMaestroCommission = MastercardMaestroCommission,
            VisaMirCommission = VisaMirCommission
        )
        assertEquals(result, 32_000)
    }

    @Test
    fun commissionVisaMir() {
        val card4 = "Mir"
        val transfers = 5_000
        val MonthTransfers = 80_000
        val MastercardMaestroCommission = 0.06
        val VisaMirCommission = 0.075

        val result = Commission(
            card = card4,
            transfers = transfers,
            MonthTransfers = MonthTransfers,
            MastercardMaestroCommission = MastercardMaestroCommission,
            VisaMirCommission = VisaMirCommission
        )
        assertEquals(result, 37_500)
    }
}