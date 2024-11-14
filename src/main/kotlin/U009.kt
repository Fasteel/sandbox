package org.example

/**
 * https://www.codewars.com/kata/56606694ec01347ce800001b
 *
 * Implement a function that accepts 3 integer values a, b, c. The function should return true if a triangle can be built with the sides of given length and false in any other case.
 *
 * (In this case, all triangles must have surface greater than 0 to be accepted).
 *
 * Examples:
 *
 * Input -> Output
 * 1,2,2 -> true
 * 4,2,3 -> true
 * 2,2,2 -> true
 * 1,2,3 -> false
 * -5,1,3 -> false
 * 0,2,3 -> false
 * 1,2,9 -> false
 */

// FIXME to improve using sorted
fun isTriangle(a: Int, b: Int, c: Int): Boolean {
    if (a <= 0 || b <= 0 || c <= 0) return false
    val result = mutableListOf(a, b, c)
    val max = result.max()
    result.remove(max)
    val sum = result.sum()
    return sum > max
}