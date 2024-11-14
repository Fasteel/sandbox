import org.example.mxdiflg
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class U010KtTest {
    @Test
    fun sampleTests() {
        var s1 = arrayOf(
            "hoqq",
            "bbllkw",
            "oox",
            "ejjuyyy",
            "plmiis",
            "xxxzgpsssa",
            "xxwwkktt",
            "znnnnfqknaz",
            "qqquuhii",
            "dvvvwz"
        )
        var s2 = arrayOf("cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww")
        assertEquals(13, mxdiflg(s1, s2))
        s1 = arrayOf(
            "ejjjjmmtthh",
            "zxxuueeg",
            "aanlljrrrxx",
            "dqqqaaabbb",
            "oocccffuucccjjjkkkjyyyeehh"
        )
        s2 = arrayOf("bbbaaayddqbbrrrv")
        assertEquals(10, mxdiflg(s1, s2))
    }
}