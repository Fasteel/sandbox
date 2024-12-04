package org.example.aoc2024

import java.io.File

fun main() {
}

private fun d03sol1() {
    var c = 0
    File("/Users/carlmonnera/Documents/dojo/kotlin/sandbox/src/main/kotlin/aoc2024/D03.txt").forEachLine {
        val l = extractMultiplyNumber(it)
        c += sumEachPair(l)
    }
    println(c)
}

private fun d03sol2() {
    val t =
        File("/Users/carlmonnera/Documents/dojo/kotlin/sandbox/src/main/kotlin/aoc2024/D03.txt").readText()
    println(sumPortion(t))
}

fun extractMultiplyNumber(s: String): List<Pair<Int, Int>> =
    """mul\((\d{0,3})\,(\d{0,3})\)"""
        .toRegex()
        .findAll(s)
        .map { Pair(it.groupValues[1].toInt(), it.groupValues[2].toInt()) }
        .toList()

fun sumEachPair(l: List<Pair<Int, Int>>): Int = l.sumOf { it.first * it.second }

fun sumPortion(s: String): Int {
    return s.split("do()")
        .map { it.substringBefore("don't()") }
        .sumOf {
            sumEachPair(extractMultiplyNumber(it))
        }
}
