package ru.netology

fun main() {

    val card = "VkPay"
    val transfers = 1_000
    val MonthTransfers = 0
    val MastercardMaestroCommission = 0.06
    val VisaMirCommission = 0.075

    limits(card, transfers, MonthTransfers, MastercardMaestroCommission, VisaMirCommission)
}

fun limits(card: String, transfers: Int, MonthTransfers: Int, MastercardMaestroCommission: Double,
           VisaMirCommission: Double)
{
    if (card == "VkPay" && (transfers > 15_000 || MonthTransfers > 40_000)) {
        println("Превышен лимит")
    } else if (transfers < 150_000 && MonthTransfers < 600_000) {
        val commission = Commission(card, transfers, MonthTransfers, MastercardMaestroCommission,
            VisaMirCommission)
        println("Комиссия с вашего перевода составляет: $commission коп.")
    }
}

fun Commission(card: String, transfers: Int, MonthTransfers: Int, MastercardMaestroCommission: Double,
                        VisaMirCommission: Double): Int {

    val card1 = "Maestro"
    val card2 = "Mastercard"
    val card3 = "Visa"
    val card4 = "Mir"

    return when (card) {
        "VkPay" -> 0
        card2 , card1 -> {
            if (MonthTransfers <= 75_000) 0
            else ((transfers * MastercardMaestroCommission + 20) * 100).toInt()
        }
        card3, card4 -> {((transfers * VisaMirCommission) * 100).toInt()
        } else -> 0
    }
}
