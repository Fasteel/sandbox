package org.example

fun main() {
    val lstOfArt = arrayOf("ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600")
    println(lstOfArt.groupingBy { it.first() }
        .fold(0) { acc, curr -> acc + curr.split(" ")[1].toInt() }
    )
}