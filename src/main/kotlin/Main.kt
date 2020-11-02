package ru.netology

fun main() {

    val card = "VkPay"
    val transfers = 1_000
    val monthTransfers = 0
    val mastercardMaestroCommission = 0.06
    val visaMirCommission = 0.075

    limits(card, transfers, monthTransfers, mastercardMaestroCommission, visaMirCommission)
}

fun limits(card: String, transfers: Int, monthTransfers: Int, mastercardMaestroCommission: Double,
           visaMirCommission: Double)
{
    if (card == "VkPay" && (transfers > 15_000 || monthTransfers > 40_000)) {
        println("Превышен лимит")
    } else if (transfers < 150_000 && monthTransfers < 600_000) {
        val commission = commission(card, transfers, monthTransfers, mastercardMaestroCommission,
            visaMirCommission)
        println("Комиссия с вашего перевода составляет: $commission коп.")
    }
}

fun commission(card: String, transfers: Int, monthTransfers: Int, mastercardMaestroCommission: Double,
                        visaMirCommission: Double): Int {

    val card1 = "Maestro"
    val card2 = "Mastercard"
    val card3 = "Visa"
    val card4 = "Mir"

    return when (card) {
        "VkPay" -> 0
        card2 , card1 -> {
            if (monthTransfers <= 75_000) 0
            else ((transfers * mastercardMaestroCommission + 20) * 100).toInt()
        }
        card3, card4 -> {((transfers * visaMirCommission) * 100).toInt()
        } else -> 0
    }
}
