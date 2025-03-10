package org.example

class Engine(val horsepower: Int)
class Car(val engine: Engine)

fun main() {
    val e = Engine(110)
    Car(e)
}