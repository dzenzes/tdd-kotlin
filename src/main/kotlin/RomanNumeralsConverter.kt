private val numbers = linkedMapOf(
    1000 to "M",
    900 to "CM",
    500 to "D",
    400 to "CD",
    100 to "C",
    90 to "XC",
    50 to "L",
    40 to "XL",
    10 to "X",
    9 to "IX",
    5 to "V",
    4 to "IV",
    1 to "I"
)

/*
* notes
* started with when block with recursion
* then used test factory after some google to make it easier to add some tests
* final refactor introduced the linkedMap
 */

fun convert(input: Int): String {
    numbers.keys.forEach { key ->
        if (input >= key) {
            return numbers[key] + convert(input - key)
        }
    }
    return ""
}