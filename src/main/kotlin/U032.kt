package org.example

//object BuyCar {
//    fun nbMonths(
//        startPriceOld: Int,
//        startPriceNew: Int,
//        savingPerMonth: Int,
//        percentLossByMonth: Double
//    ): Pair<Int, Int> {
//        var decreaseRate = 1 - percentLossByMonth / 100
//        var month = 0
//        var currentPriceOld = startPriceOld.toDouble()
//        var currentPriceNew = startPriceNew.toDouble()
//
//        while ((month * savingPerMonth) + currentPriceOld < currentPriceNew) {
//            month += 1
//            if (month % 2 == 0) decreaseRate -= 0.005
//            currentPriceNew *= decreaseRate
//            currentPriceOld *= decreaseRate
//        }
//
//        return Pair(
//            month,
//            (month * savingPerMonth + currentPriceOld - currentPriceNew).roundToInt()
//        )
//    }
//}