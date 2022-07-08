import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory


class RomanNumeralsTest {

    private val testData = listOf(
        0 to "",
        1 to "I",
        2 to "II",
        3 to "III",
        4 to "IV",
        5 to "V",
        6 to "VI",
        7 to "VII",
        8 to "VIII",
        9 to "IX",
        10 to "X",
        11 to "XI",
        12 to "XII",
        13 to "XIII",
        15 to "XV",
        19 to "XIX",
        20 to "XX",
        30 to "XXX",
        40 to "XL",
        48 to "XLVIII",
        50 to "L",
        79 to "LXXIX",
        90 to "XC",
        100 to "C",
        400 to "CD",
        500 to "D",
        799 to "DCCXCIX",
        849 to "DCCCXLIX",
        900 to "CM",
        1981 to "MCMLXXXI",
        1000 to "M",
        2022 to "MMXXII",
    )


    @TestFactory
    fun `roman numerals converter`() = testData.map { (input, expected) ->
        DynamicTest.dynamicTest("returns '$expected' for $input") {
            assertEquals(expected, convert(input))
        }
    }


}