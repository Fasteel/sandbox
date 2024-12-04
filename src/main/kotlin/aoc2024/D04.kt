package org.example.aoc2024

import java.io.File

fun main() {
    val input =
        File("/Users/carlmonnera/Documents/dojo/kotlin/sandbox/src/main/kotlin/aoc2024/D04.txt").readText()
    println(d04sol1(input))
    println(d04sol2(input))
}

fun d04sol1(input: String): Int {
    var c = 0
    val wordSearch = "XMAS"
    val direction = listOf(
        Pair(1, 0),
        Pair(-1, 0),
        Pair(0, 1),
        Pair(0, -1),
        Pair(1, 1),
        Pair(-1, -1),
        Pair(-1, 1),
        Pair(1, -1),
    )
    val l = input.trimIndent().split("\n").map(String::toList)
    for (y in l.indices) {
        for (x in l[y].indices) {
            direction.forEach {
                if (findInDirectionSol1(
                        xPosition = Pair(x, y),
                        direction = it,
                        list = l,
                        wordSearch = wordSearch
                    )
                ) {
                    c++
                }
            }
        }
    }
    return c
}

fun d04sol2(input: String): Int {
    val aPosition = mutableListOf<Pair<Int, Int>>()
    val wordSearch = "MAS"
    val direction = listOf(
        Pair(1, 1),
        Pair(-1, -1),
        Pair(-1, 1),
        Pair(1, -1),
    )
    val l = input.trimIndent().split("\n").map(String::toList)
    for (y in l.indices) {
        for (x in l[y].indices) {
            direction.forEach {
                val a = findInDirectionSol2(
                    xPosition = Pair(x, y),
                    direction = it,
                    list = l,
                    wordSearch = wordSearch
                )
                if (a.first != -1 && a.second != -1) {
                    aPosition.add(a)
                }
            }
        }
    }
    return aPosition
        .groupingBy { it }
        .eachCount()
        .filter { it.value % 2 == 0 }
        .map { it.value / 2 }
        .sumOf { it }
}

fun findInDirectionSol1(
    xPosition: Pair<Int, Int>,
    direction: Pair<Int, Int>,
    list: List<List<Char>>,
    wordSearch: String,
): Boolean {
    repeat(wordSearch.length) {
        val x = xPosition.first + (it * direction.first)
        val y = xPosition.second + (it * direction.second)

        if (x < 0 || y < 0 || y > list.size - 1 || x > list[y].size - 1 || list[y][x] != wordSearch[it]) {
            return false
        }
    }
    return true
}

fun findInDirectionSol2(
    xPosition: Pair<Int, Int>,
    direction: Pair<Int, Int>,
    list: List<List<Char>>,
    wordSearch: String,
): Pair<Int, Int> {
    var aPosition: Pair<Int, Int> = Pair(-1, -1)
    repeat(wordSearch.length) {
        val x = xPosition.first + (it * direction.first)
        val y = xPosition.second + (it * direction.second)

        if (x < 0 || y < 0 || y > list.size - 1 || x > list[y].size - 1 || list[y][x] != wordSearch[it]) {
            return Pair(-1, -1)
        } else if (list[y][x] == 'A') {
            aPosition = Pair(y, x)
        }
    }
    return aPosition
}
