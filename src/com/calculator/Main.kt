package com.calculator

fun main() {
    val c: Calculator = CalculatorProvider().createDefaultCalculator()
    print(c.calculate("-cvs234_529fv34svd"))
}