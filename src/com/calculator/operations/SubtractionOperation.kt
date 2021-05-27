package com.calculator.operations

class SubtractionOperation: Operation {
    override fun doIt(first: Number, second: Number): Number = first.toDouble() - second.toDouble()
}