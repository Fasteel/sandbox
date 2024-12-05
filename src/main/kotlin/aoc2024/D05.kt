package org.example.aoc2024

import java.io.File

fun main() {
    d05sol2()
}

fun d05sol1() {
    var s = 0
    val input =
        File("/Users/carlmonnera/Documents/dojo/kotlin/sandbox/src/main/kotlin/aoc2024/D05.txt").readText()
    val v = input.split("\n\n")
    val rules = strToRules(v[0])
    v[1].trimIndent().split("\n").forEach {
        val line = strToLine(it)
        if (lineIsCorrect(rules, line)) s += getMiddleUpdate(line)
    }
    println(s)
}

fun d05sol2() {
    var s = 0
    val input =
        File("/Users/carlmonnera/Documents/dojo/kotlin/sandbox/src/main/kotlin/aoc2024/D05.txt").readText()
    val v = input.split("\n\n")
    val rules = strToRules(v[0])
    v[1].trimIndent().split("\n").forEach {
        val line = strToLine(it)
        if (!lineIsCorrect(rules, line)) {
            val nl = correctLine(rules, line)
            s += getMiddleUpdate(nl)
        }
    }
    println(s)
}

fun lineIsCorrect(rules: List<Pair<Int, Int>>, line: List<Int>): Boolean {
    for (x in line.indices) {
        val rx = rules.filter { it.first == line[x] }.map { it.second }
        for (r in rx.indices) {
            val idx = line.indexOf(rx[r])
            if (idx < x && idx != -1) return false
        }
    }
    return true
}

fun lineIncorrectI(rules: List<Pair<Int, Int>>, line: List<Int>): Int {
    for (x in line.indices) {
        val rx = rules.filter { it.first == line[x] }.map { it.second }
        for (r in rx.indices) {
            val idx = line.indexOf(rx[r])
            if (idx < x && idx != -1) return line.indexOf(line[x])
        }
    }
    return -1
}

fun strToRules(str: String): List<Pair<Int, Int>> = str.trimIndent().split("\n").map {
    val r = it.split("|")
    Pair(r[0].toInt(), r[1].toInt())
}

fun strToLine(str: String): List<Int> = str.split(',').map(String::toInt)

fun getMiddleUpdate(line: List<Int>): Int = line[line.size / 2]

fun correctLine(rules: List<Pair<Int, Int>>, line: List<Int>): List<Int> {
    if (lineIsCorrect(rules, line)) {
        return line
    }

    val i = lineIncorrectI(rules, line)
    val newLine = line.toMutableList()
    newLine[i - 1] = line[i]
    newLine[i] = line[i - 1]

    return correctLine(rules, newLine)
}