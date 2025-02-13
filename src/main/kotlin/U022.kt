package org.example

/**
 * Let us consider this example (array written in general format):
 *
 * ls = [0, 1, 3, 6, 10]
 *
 * It's following parts:
 *
 * ls = [0, 1, 3, 6, 10]
 * ls = [1, 3, 6, 10]
 * ls = [3, 6, 10]
 * ls = [6, 10]
 * ls = [10]
 * ls = []
 *
 * The corresponding sums are (put together in a list): [20, 20, 19, 16, 10, 0]
 *
 * The function parts_sums (or its variants in other languages) will take as parameter a list ls
 * and return a list of the sums of its parts as defined above.
 *
 * Other Examples:
 * ls = [1, 2, 3, 4, 5, 6]
 * parts_sums(ls) -> [21, 20, 18, 15, 11, 6, 0]
 *
 * ls = [744125, 935, 407, 454, 430, 90, 144, 6710213, 889, 810, 2579358]
 * parts_sums(ls) -> [10037855, 9293730, 9292795, 9292388, 9291934, 9291504, 9291414, 9291270, 2581057, 2580168, 2579358, 0]
 * Notes
 * Take a look at performance: some lists have thousands of elements.
 */

//fun sumParts(ls: IntArray): IntArray {
//    if (ls.isEmpty()) return intArrayOf(0)
//    val res = mutableListOf<Int>()
//    for (i in ls.indices) {
//        var sum = 0
//        for (y in i..<ls.size) {
//            sum += ls[y]
//        }
//        res += sum
//    }
//    res += 0
//    return res.toIntArray()
//}

fun sumParts(ls: IntArray): IntArray {
    val result = IntArray(ls.size + 1)
    for (i in ls.indices.reversed()) {
        result[i] = result[i + 1] + ls[i]
    }
    return result
}

fun main() {
    sumParts(intArrayOf(0, 1, 3, 6, 10))
}