package aoc2024

import org.example.aoc2024.d07sol1
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class D07KtTest {

    @Test
    fun oneTwoEquation_shouldReturnTwo() {
        assertEquals(
            d07sol1(
                """
                190: 10 19
                3267: 81 40 27
                18: 9 9
                292: 11 6 16 20
            """
            ), 3
        )
    }
}