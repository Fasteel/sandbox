package org.example

fun main() {
    val test = "123"
    print(test.sumOf { v -> v.digitToInt() })
}