package com.calculator.operations

/**
 * Hi
 */
class AdditionOperation: Operation {
    /**
     * hi ther
     */
    override fun doIt(first: Number, second: Number): Number = first.toDouble() + second.toDouble()
}