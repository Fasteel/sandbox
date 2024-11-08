import org.example.decodeMorse
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class U007KtTest {
    @Test
    fun exampleTestCases() {
        assertEquals("HEY JUDE", decodeMorse(".... . -.--   .--- ..- -.. ."))
        assertEquals("HEY S0S", decodeMorse(".... . -.--   ... ----- ..."))
        assertEquals("HEY SOS", decodeMorse(".... . -.--   ...---..."))
        assertEquals("HEY SOS", decodeMorse(" .... . -.--   ...---..."))
        assertEquals("HEY SOS", decodeMorse(".... . -.--   ...---... "))
        assertEquals("SOS! THE", decodeMorse("... --- ... -.-.--   - .... ."))
        assertEquals("SOS!", decodeMorse("...---... -.-.--"))
        assertEquals("SOS.", decodeMorse("...---... .-.-.-"))
        assertEquals("SOS", decodeMorse("... --- ..."))
    }
}
