import org.example.bouncingBall
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class U014KtTest {
    @Test
    fun test1() {
        assertEquals(3, bouncingBall(3.0, 0.66, 1.5))
    }

    @Test
    fun test2() {
        assertEquals(15, bouncingBall(30.0, 0.66, 1.5))
    }
}