import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class U027KtTest {
    private fun testing(lstOfArt: Array<String>, lstOfCat: Array<String>, expect: String) {
//        val actual: String = StockList.stockSummary(lstOfArt, lstOfCat)
        assertEquals(expect, "")
    }

    @Test
    fun basicTests() {
        var lstOfArt = arrayOf("BBAR 150", "CDXE 515", "BKWR 250", "BTSQ 890", "DRTY 600")
        var lstOfCat = arrayOf("A", "B", "C", "D")
        var res = "(A : 0) - (B : 1290) - (C : 515) - (D : 600)"
        testing(lstOfArt, lstOfCat, res)

        lstOfArt = arrayOf("ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600")
        lstOfCat = arrayOf("A", "B")
        res = "(A : 200) - (B : 1140)"
        testing(lstOfArt, lstOfCat, res)
    }
}