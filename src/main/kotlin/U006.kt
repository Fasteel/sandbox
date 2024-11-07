package org.example

/**
 * https://www.codewars.com/kata/5264d2b162488dc400000001
 *
 * Description:
 *
 * Write a function that takes in a string of one or more words, and returns the same string, but with all words that have five or more letters reversed (Just like the name of this Kata). Strings passed in will consist of only letters and spaces. Spaces will be included only when more than one word is present.
 *
 * Examples:
 *
 * "Hey fellow warriors"  --> "Hey wollef sroirraw"
 * "This is a test        --> "This is a test"
 * "This is another test" --> "This is rehtona test"
 */

//fun spinWords(sentence: String): String {
//    return sentence.split(" ").map {
//        if (it.length >= 5) it.reversed()
//        else sentence
//    }.joinToString("")
//}

fun spinWords(s: String) =
    s.split(" ").joinToString(" ") { if (it.length > 4) it.reversed() else it }
