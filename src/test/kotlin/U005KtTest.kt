import org.example.isLeapYear
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class U005KtTest {

    @Test
    fun testYear2020() {
        assertEquals(true, isLeapYear(2020))
    }

    @Test
    fun testYear400() {
        assertEquals(true, isLeapYear(400))
    }

    @Test
    fun testYear800() {
        assertEquals(true, isLeapYear(800))
    }

    @Test
    fun testYear1001() {
        assertEquals(false, isLeapYear(100))
    }

    @Test
    fun testYear1002() {
        assertEquals(false, isLeapYear(200))
    }

    @Test
    fun testYear1003() {
        assertEquals(false, isLeapYear(300))
    }

    @Test
    fun testYear2000() {
        assertEquals(true, isLeapYear(2000))
    }

    @Test
    fun testYear2015() {
        assertEquals(false, isLeapYear(2015))
    }

    @Test
    fun testYear2100() {
        assertEquals(false, isLeapYear(2100))
    }
}