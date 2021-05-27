package com.calculator.operations

class AdditionOperation: Operation {
    override fun doIt(first: Number, second: Number): Number = first.toDouble() + second.toDouble()
}