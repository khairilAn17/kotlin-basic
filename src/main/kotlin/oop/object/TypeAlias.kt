package oop.`object`

import oop.classes.Person

/***
 * Kotlin memungkinkan kita untuk membuat nama berbeda dari data yg sama
 * dengan menggunakan kata kunci typealias
 * type alias juga juga dapat digunakan untuk function
 */

typealias Orang = Person
fun main() {
    val orang = Orang("Khairil anwar");
    print(orang.name)
}