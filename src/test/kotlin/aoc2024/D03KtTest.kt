package aoc2024

import org.example.aoc2024.extractMultiplyNumber
import org.example.aoc2024.sumEachPair
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class D03KtTest {

    @Test
    fun someMulInString_returnListOfMultipliedValues() {
        assertEquals(
            listOf(
                Pair(2, 4),
                Pair(5, 5),
                Pair(11, 8),
                Pair(8, 5)
            ),
            extractMultiplyNumber("xmul(2,4)%&mul[3,7]!@^do_not_mul(5,5)+mul(32,64]then(mul(11,8)mul(8,5))")
        )
        assertEquals(
            listOf(
                Pair(4, 4),
                Pair(11, 8),
                Pair(8, 5)
            ),
            extractMultiplyNumber("xmul(4,4)%&mul[3,7]!@^do_not_mul5,5)+mul(32,64]then(mul(11,8)mul(8,5))")
        )
    }

    @Test
    fun listOfPair_returnSum() {
        assertEquals(
            12,
            sumEachPair(
                listOf(
                    Pair(2, 3),
                    Pair(3, 2)
                )
            )
        )
        assertEquals(
            20,
            sumEachPair(
                listOf(
                    Pair(2, 5),
                    Pair(5, 2)
                )
            )
        )
    }
}