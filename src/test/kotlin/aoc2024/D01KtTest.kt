package aoc2024

import org.example.aoc2024.d01sol1
import org.example.aoc2024.d01sol2
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class D01KtTest {
    @Test
    fun shouldReturn11() {
        assertEquals(
            11, d01sol1(
                listOf(
                    3,
                    4,
                    2,
                    1,
                    3,
                    3
                ),
                listOf(
                    4,
                    3,
                    5,
                    3,
                    9,
                    3
                )
            )
        )
    }

    @Test
    fun shouldReturn31() {
        assertEquals(
            31, d01sol2(
                listOf(
                    3,
                    4,
                    2,
                    1,
                    3,
                    3
                ),
                listOf(
                    4,
                    3,
                    5,
                    3,
                    9,
                    3
                )
            )
        )
    }
}