package oop.`object`

import oop.classes.Television

fun main() {
    val television = Television();
    //println(television.brand) // error karena initTelevision belum dipanggil

    television.iniTelevision("Lenovo")
    println(television.brand) // tidak erro
}