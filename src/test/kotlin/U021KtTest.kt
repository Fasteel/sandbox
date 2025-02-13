import org.example.parse
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class U021KtTest {
    @Test
    fun exampleTests() {
        assertEquals(listOf(8, 64), parse("iiisdoso"))
        assertEquals(listOf(8, 64, 3600), parse("iiisdosodddddiso"))
    }
}
