import org.example.maskify
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class U008KtTest {
    @Test
    fun sampleTest() {
        assertEquals("", maskify(""))
        assertEquals("1", maskify("1"))
        assertEquals("123", maskify("123"))
        assertEquals("########d2eA", maskify("SF&SDfgsd2eA"))
        assertEquals("############5616", maskify("4556364607935616"))
        assertEquals("#######5616", maskify("64607935616"))
        assertEquals("##ippy", maskify("Skippy"))
        assertEquals(
            "####################################man!",
            maskify("Nananananananananananananananana Batman!")
        )
    }
}
