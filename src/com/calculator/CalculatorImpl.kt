package com.calculator

import com.calculator.operations.Operation
import com.calculator.operations.OperationProvider
import java.util.*

class CalculatorImpl(val operations: Map<Char, Operation> = OperationProvider.standardOperations) : Calculator {

    override fun calculate(input: String): String {
        val splittedInput = cleanInput(input)
        var result: Number? = null
        for ((index, item) in splittedInput.withIndex()) {
            if (operations.containsKey(item.first())) {
                val firstNumber = result ?: parseNumberText(splittedInput[index - 1])
                val lastNumber = parseNumberText(splittedInput[index + 1])
                result = operations[item.first()]!!.doIt(firstNumber, lastNumber)
                println("$firstNumber ${item.first()} $lastNumber = $result")
            }
        }
        return "Result is $result"
    }

    private fun cleanInput(input: String): List<String> {
        var cleanedInput = input.filter { it.isDigit() || operations.keys.contains(it) || it == '.' || it == ',' }
        for (key in operations.keys) {
            cleanedInput = cleanedInput.replace(key.toString(), " $key ")
        }
        return cleanedInput.split(" ").map { if (it == "") "0.0" else it }
    }

    private fun parseNumberText(numberText: String): Number {
        return numberText.toIntOrNull() ?: numberText.toDoubleOrNull() ?: 0
    }
}