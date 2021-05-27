package com.calculator

fun main() {
    val calculator = CalculatorProvider().createDefaultCalculator()
    print(calculator.calculate("-cvs234+52fv34svd"))
}