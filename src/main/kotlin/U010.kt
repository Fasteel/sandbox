package org.example

import kotlin.math.abs

/**
 * https://www.codewars.com/kata/5663f5305102699bad000056/kotlin
 *
 * You are given two arrays a1 and a2 of strings. Each string is composed with letters from a to z. Let x be any string in the first array and y be any string in the second array.
 *
 * Find max(abs(length(x) − length(y)))
 *
 * If a1 and/or a2 are empty return -1 in each language except in Haskell (F#) where you will return Nothing (None).
 *
 * Example:
 * a1 = ["hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"]
 * a2 = ["cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"]
 * mxdiflg(a1, a2) --> 13
 * Bash note:
 * input : 2 strings with substrings separated by ,
 * output: number as a string
 */

// FIXME: Use flatMap
fun mxdiflg(a1: Array<String>, a2: Array<String>): Int {
    if (a1.isEmpty() || a2.isEmpty()) return -1
    var biggestDiff = 0
    a1.forEach { v1 ->
        a2.forEach { v2 ->
            val v = abs(v1.length - v2.length)
            if (v > biggestDiff) biggestDiff = v
        }
    }
    return biggestDiff
}
