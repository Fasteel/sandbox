import org.junit.jupiter.api.Test

class U019KtTest {
    private fun doTest(lng: Int, wdth: Int, expect: List<Int>?) {
        println("lng: $lng wdth: $wdth")
//        val actual = sqInRect(lng, wdth)
//        assertEquals(expect, actual)
    }

    @Test
    fun test1() {
        doTest(5, 3, listOf(3, 2, 1, 1))
        doTest(5, 5, null)
        doTest(20, 14, listOf(14, 6, 6, 2, 2, 2))
    }
}