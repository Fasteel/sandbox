import org.example.Foo
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class U001KtTest {
    @Test
    fun fooTest() {
        val f = Foo(bar = "test")
        assertEquals("test", f.bar)
    }
}