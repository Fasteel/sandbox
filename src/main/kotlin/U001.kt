package org.example

fun main() {
    println(Foo(bar = "toto"))
}

data class Foo(val bar: String)
