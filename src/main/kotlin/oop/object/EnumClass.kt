package oop.`object`

import oop.classes.Gender

fun main() {
    val man = Gender.MALE
    val woman = Gender.FEMALE
    val allGender: Array<Gender> = Gender.values() //untuk mengembalikan semua nilainya

    val manFromString = Gender.valueOf("MALE") //conversi ke String
}