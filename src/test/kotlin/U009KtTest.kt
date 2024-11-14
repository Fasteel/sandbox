import org.example.isTriangle
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class U009KtTest {
    private fun checkTriangle(expected: Boolean, a: Int, b: Int, c: Int) {
        val actual = isTriangle(a, b, c)
        assertEquals(expected, actual, "Incorrect answer for a = $a, b = $b, c = $c\n")
    }

    @Test
    @DisplayName("Sample Tests")
    fun sampleTests() {
        checkTriangle(true, 1, 2, 2)
        checkTriangle(false, 7, 2, 2)
        checkTriangle(true, 2, 2, 2)
        checkTriangle(false, 2, 4, 6)
    }
}