package oop.`object`

import oop.classes.Product
import oop.classes.Product1

fun main() {
    val product = Product("Nasi", 10000, "food");
    val copyProduct = Product("Ikan", 10000, "food"); // ini merupakan copy data class

    val product1 = Product1("hp", 1000000, "Elektronik");

    println(product); //data class
    println(copyProduct); //data class
    println(product1);
}