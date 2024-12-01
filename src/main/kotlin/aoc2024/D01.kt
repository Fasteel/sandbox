package org.example.aoc2024

import java.io.File
import kotlin.math.abs

fun main() {
    val l1 = mutableListOf<Int>()
    val l2 = mutableListOf<Int>()
    File("/Users/carlmonnera/Documents/dojo/kotlin/sandbox/src/main/kotlin/aoc2024/D01.txt").forEachLine {
        val r = it.split("   ")
        l1.add(r[0].toInt())
        l2.add(r[1].toInt())
    }
    println(d01sol1(l1, l2))
    println(d01sol2(l1, l2))
}

// FIXME: Use unzip / map cf: https://www.youtube.com/watch?v=r7nMRJ57QA0
fun d01sol1(l1: List<Int>, l2: List<Int>): Int {
    val l1s = l1.sorted()
    val l2s = l2.sorted()
    var res = 0

    for (i in l1s.indices)
        res += abs(l1s[i] - l2s[i])

    return res
}

fun d01sol2(l1: List<Int>, l2: List<Int>): Int {
    var res = 0

    for (i in l1.indices)
        for (y in l1.indices)
            if (l1[i] == l2[y])
                res += l1[i]

    return res
}