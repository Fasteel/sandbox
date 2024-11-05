import org.example.makeComplement
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class U003KtTest {
    @Test
    fun test01() {
        assertEquals("TTTT", makeComplement("AAAA"));
    }

    @Test
    fun test02() {
        assertEquals("TAACG", makeComplement("ATTGC"));
    }
}