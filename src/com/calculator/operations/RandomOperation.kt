package com.calculator.operations

import kotlin.random.Random

class RandomOperation: Operation {

    override fun doIt(first: Number, second: Number): Number {
        return Random.nextInt(first.toInt(), second.toInt())
    }
}