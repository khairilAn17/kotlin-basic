package oop.`object`

import oop.classes.Company

fun main() {
    val company1 = Company("Khairil")
    val company2 = Company("Khairil")

    println(company1 == company2) // false: Karena kedua object berbeda lokasi memori, true: karena equals sudah diubah

    println(company1.hashCode() ==  company2.hashCode()) // true: karena hashCode() telah di-override
}