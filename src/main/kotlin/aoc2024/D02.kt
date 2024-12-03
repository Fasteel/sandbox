package org.example.aoc2024

import java.io.File
import kotlin.math.abs

// FIXME: Use zipWithNext
fun main() {
    var c = 0
    File("/Users/carlmonnera/Documents/dojo/kotlin/sandbox/src/main/kotlin/aoc2024/D02.txt").forEachLine { it ->
        val r = it.split(" ").map(String::toInt)
        if (isValidRow(r)) {
            c++
        }
    }
    println(c)
}

fun isValidRow(l: List<Int>): Boolean {
    if (isOrdered(l) && listDifferCorrect(l)) {
        return true
    } else {
        for (i in l.indices) {
            val nl = l.toMutableList().apply { removeAt(i) }
            if (isOrdered(nl) && listDifferCorrect(nl)) {
                return true
            }
        }
    }

    return false
}

fun listDifferCorrect(l: List<Int>): Boolean {
    for (i in l.indices) {
        if (i != l.size - 1 && !isDifferCorrect(l[i], l[i + 1])) {
            return false
        }
    }
    return true
}

fun isDifferCorrect(current: Int, next: Int): Boolean {
    return abs(current - next) <= 3
}

fun isOrdered(l: List<Int>): Boolean {
    return l.sorted() == l || l.sortedDescending() == l
}
