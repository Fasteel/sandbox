package org.example

/**
 * https://www.codewars.com/kata/51e0007c1f9378fa810002a9/train/kotlin
 *
 * Create a parser to interpret and execute the Deadfish language.
 *
 * Deadfish operates on a single value in memory, which is initially set to 0.
 *
 * It uses four single-character commands:
 *
 * i: Increment the value
 * d: Decrement the value
 * s: Square the value
 * o: Output the value to a result array
 * All other instructions are no-ops and have no effect.
 *
 * Examples
 * Program "iiisdoso" should return numbers [8, 64].
 * Program "iiisdosodddddiso" should return numbers [8, 64, 3600].
 */

fun parse(data: String): List<Int> = buildList {
    var value = 0
    for (char in data) {
        when (char) {
            'i' -> value++
            'd' -> value--
            's' -> value *= value
            'o' -> add(value)
        }
    }
}

fun main() {
}
