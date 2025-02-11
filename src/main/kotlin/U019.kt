package org.example

import kotlin.math.min

fun sqInRect(lng: Int, wdth: Int): List<Int>? {
    if (lng == wdth) return null

    val result = mutableListOf<Int>()

    var currentLength = lng
    var currentWidth = wdth

    while (currentLength > 0 && currentWidth > 0) {
        val minSide = min(currentLength, currentWidth)

        if (currentLength > currentWidth) currentLength -= minSide
        else currentWidth -= minSide

        result += minSide
    }

    return result
}
