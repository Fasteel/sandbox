import org.example.convert
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class U002KtTest {
    @Test
    fun `true should return true`() {
        assertEquals("true", convert(true))
    }

    @Test
    fun `false should return false`() {
        assertEquals("false", convert(false))
    }
}