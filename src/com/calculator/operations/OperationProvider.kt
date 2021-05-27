package com.calculator.operations

class OperationProvider {

    companion object {
        val standardOperations: Map<Char, Operation> = mapOf('+' to AdditionOperation(), '-' to SubtractionOperation())
    }
}