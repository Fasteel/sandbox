package org.example

//fun stockSummary(lstOfArt: Array<String>, lstOfCat: Array<String>): String {
//    return lstOfCat.joinToString(" - ") {
//        "($it : ${
//            lstOfArt
//                .groupingBy { it.take(1) }
//                .fold(0, { acc, el ->
//                    acc + el.split(' ')[1].toInt()
//                })
//                .getOrDefault(it, "0")
//        })"
//    }
//}