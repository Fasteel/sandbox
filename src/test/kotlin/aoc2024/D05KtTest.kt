package aoc2024

import org.example.aoc2024.correctLine
import org.example.aoc2024.getMiddleUpdate
import org.example.aoc2024.lineIsCorrect
import org.example.aoc2024.strToRules
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class D05KtTest {
    @Test
    fun strToRules_returnAsList() {
        assertEquals(
            listOf(
                Pair(47, 53),
                Pair(97, 13),
                Pair(97, 61),
                Pair(97, 47)
            ),
            strToRules(
                """
                47|53
                97|13
                97|61
                97|47
                """
            )
        )
    }

    @Test
    fun lineIsCorrect_returnTrue() {
        assertEquals(
            true,
            lineIsCorrect(
                listOf(
                    Pair(47, 53),
                    Pair(97, 13),
                    Pair(97, 61),
                    Pair(97, 47),
                    Pair(75, 29),
                    Pair(61, 13),
                    Pair(75, 53),
                    Pair(29, 13),
                    Pair(97, 29),
                    Pair(53, 29),
                    Pair(61, 53),
                    Pair(97, 53),
                    Pair(61, 29),
                    Pair(47, 13),
                    Pair(75, 47),
                    Pair(97, 75),
                    Pair(47, 61),
                    Pair(75, 61),
                    Pair(47, 29),
                    Pair(75, 13),
                    Pair(53, 13)
                ),
                listOf(
                    75,
                    47,
                    61,
                    53,
                    29
                )
            )
        )
    }

    @Test
    fun getMiddleUpdate_returnCorrectValues() {
        assertEquals(
            61,
            getMiddleUpdate(
                listOf(
                    75, 47, 61, 53, 29
                )
            )
        )
        assertEquals(
            53,
            getMiddleUpdate(
                listOf(
                    97, 61, 53, 29, 13
                )
            )
        )
        assertEquals(
            29,
            getMiddleUpdate(
                listOf(
                    75, 29, 13
                )
            )
        )
    }

    @Test
    fun correctLine_returnCorrectValues() {
        assertEquals(
            listOf(97, 75, 47, 61, 53),
            correctLine(
                listOf(
                    Pair(47, 53),
                    Pair(97, 13),
                    Pair(97, 61),
                    Pair(97, 47),
                    Pair(75, 29),
                    Pair(61, 13),
                    Pair(75, 53),
                    Pair(29, 13),
                    Pair(97, 29),
                    Pair(53, 29),
                    Pair(61, 53),
                    Pair(97, 53),
                    Pair(61, 29),
                    Pair(47, 13),
                    Pair(75, 47),
                    Pair(97, 75),
                    Pair(47, 61),
                    Pair(75, 61),
                    Pair(47, 29),
                    Pair(75, 13),
                    Pair(53, 13)
                ),
                listOf(
                    75, 97, 47, 61, 53
                )
            )
        )
    }
}