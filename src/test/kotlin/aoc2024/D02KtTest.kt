package aoc2024

import org.example.aoc2024.isDifferCorrect
import org.example.aoc2024.isOrdered
import org.example.aoc2024.isValidRow
import org.example.aoc2024.listDifferCorrect
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class D02KtTest {
    @Test
    fun listFullAsc_returnTrue() {
        assertEquals(true, isOrdered(listOf(1, 2, 3, 4)))
        assertEquals(true, isOrdered(listOf(1, 2, 3, 4, 4, 5)))
    }

    @Test
    fun listNotFullAsc_returnFalse() {
        assertEquals(false, isOrdered(listOf(1, 3, 2, 4)))
    }

    @Test
    fun listFullDesc_returnTrue() {
        assertEquals(true, isOrdered(listOf(4, 3, 2, 1)))
    }

    @Test
    fun listNotFullDesc_returnFalse() {
        assertEquals(false, isOrdered(listOf(4, 2, 3, 1)))
    }

    @Test
    fun correctDiffer_returnTrue() {
        assertEquals(true, isDifferCorrect(7, 6))
        assertEquals(true, isDifferCorrect(6, 7))
        assertEquals(true, isDifferCorrect(6, 8))
        assertEquals(true, isDifferCorrect(6, 9))
    }

    @Test
    fun notCorrectDiffer_returnFalse() {
        assertEquals(false, isDifferCorrect(6, 2))
        assertEquals(false, isDifferCorrect(2, 6))
        assertEquals(false, isDifferCorrect(6, 10))
    }

    @Test
    fun correctDifferList_returnTrue() {
        assertEquals(true, listDifferCorrect(listOf(7, 6, 5, 4)))
    }

    @Test
    fun notCorrectDifferList_returnFalse() {
        assertEquals(false, listDifferCorrect(listOf(7, 6, 1)))
    }

    @Test
    fun oneBadLevel_returnTrue() {
        assertEquals(true, isValidRow(listOf(1, 3, 2, 4)))
        assertEquals(true, isValidRow(listOf(1, 3, 2, 4, 5)))
        assertEquals(true, isValidRow(listOf(8, 6, 4, 4, 1)))
        assertEquals(true, isValidRow(listOf(7, 6, 4, 2, 1)))
        assertEquals(true, isValidRow(listOf(1, 3, 6, 7, 9)))
    }

    @Test
    fun twoBadLevel_returnFalse() {
        assertEquals(false, isValidRow(listOf(1, 3, 2, 4, 9)))
        assertEquals(false, isValidRow(listOf(1, 2, 7, 8, 9)))
        assertEquals(false, isValidRow(listOf(9, 7, 6, 2, 1)))
        assertEquals(false, isValidRow(listOf(1, 2, 7, 8, 9)))
    }
}