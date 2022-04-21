package oop.`object`

import oop.classes.Minus
import oop.classes.Operations
import oop.classes.Plus

fun operation(value1: Int, value2: Int, operations: Operations): Int{
    return when(operations){
        is Plus -> value1 + value2;
        is Minus -> value1 - value2;
    }
}

fun main() {
    println(operation(10,10, Plus()))
    println(operation(10,5, Minus()))
}