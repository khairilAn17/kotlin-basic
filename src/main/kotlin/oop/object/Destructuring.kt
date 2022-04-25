package oop.`object`

/**
 * Destructuring juga dapat dilakukan kepada function sehingga
 * seolah2 function mengembalikan banyak nilai
 * jika juga dapat meletakan underscore untuk variable yg tidak digunakan
 */
import oop.classes.Game
import oop.classes.MinMax

fun minmax(val1: Int, val2: Int): MinMax{
    return when{
        val1 > val2 -> MinMax(val1, val2);
        else -> MinMax(val1, val2)
    }
}

fun main() {
    val (name, price) = Game("GTA", 1000);
    println(name);
    println(price);

    val (min, max) = MinMax(12, 100);
    println(min);
    println(max);
    //val (min, _) = MinMax(12, 100); tanda ( _ ) menandakan ada variable yg tidak digunakan
}