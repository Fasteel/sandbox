package org.example

/**
 * https://www.codewars.com/kata/59cfc000aeb2844d16000075/train/kotlin
 *
 * Description:
 *
 * Given a string, capitalize the letters that occupy even indexes and odd indexes separately, and return as shown below. Index 0 will be considered even.
 * For example, capitalize("abcdef") = ['AbCdEf', 'aBcDeF']. See test cases for more examples.
 * The input will be a lowercase string with no spaces.
 *
 * Good luck!
 */
fun capitalize(text: String): List<String> {
    return listOf(
        text.mapIndexed { index, c -> if (index % 2 == 0) c.uppercase() else c }.joinToString(""),
        text.mapIndexed { index, c -> if (index % 2 == 1) c.uppercase() else c }.joinToString("")
    )
}