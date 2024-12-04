package aoc2024

import org.example.aoc2024.d04sol1
import org.example.aoc2024.d04sol2
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class D04KtTest {
    @Test
    fun sol1_detectHorizontalXMAS() {
        assertEquals(
            4,
            d04sol1(
                """
                ..X...
                .SAMX.
                .A..A.
                XMAS.S
                .X....
            """
            )
        )
        assertEquals(
            18,
            d04sol1(
                """
            MMMSXXMASM
            MSAMXMSMSA
            AMXSXMAAMM
            MSAMASMSMX
            XMASAMXAMM
            XXAMMXXAMA
            SMSMSASXSS
            SAXAMASAAA
            MAMMMXMMMM
            MXMXAXMASX
            """
            )
        )
    }

    @Test
    fun sol2_detect() {
        assertEquals(
            9,
            d04sol2(
                """
            MMMSXXMASM
            MSAMXMSMSA
            AMXSXMAAMM
            MSAMASMSMX
            XMASAMXAMM
            XXAMMXXAMA
            SMSMSASXSS
            SAXAMASAAA
            MAMMMXMMMM
            MXMXAXMASX
            """
            )
        )
    }
}