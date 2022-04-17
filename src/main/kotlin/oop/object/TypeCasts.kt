package oop.`object`

import oop.classes.Laptop

/***
 * is digunakan untuk melakukan pengecekan apakah sebuah data merupakan tipe data tertentu
 * !is kebalikan dari is
 *
 * di kotlin terdapat smart casting artinya setelah kita melakukan pengecekan dengan is maka
 * data kita akan berubah menjadi data yg kita cek
 *
 * kita juga dapat melakukan cast dengan when expression
 *
 * unsafe cast: Kita juga dapat melakukan konversi secara paksa dengan kata kunci as
 * namun sangat tidak aman karena dapat menyebabkan error
 *
 * Safe Nullable Casts: kita dapat membuat kata kunci as menjadi aman dengan menambahkan tanda tanya: as?
 * namun jika data tidak sesuai maka data akan menjadi null
 */

fun printObjectIs(any: Any){
    if(any is Laptop){
        println("Laptop ${any.name}")
    }else {
        println(any)
    }
}

fun printObjectWhen(any: Any){
    when(any) {
        is Laptop -> println("Laptop dengan merk ${any.name}")
        else -> println(any)
    }
}

fun printString(any: Any){
    val value = any as String; //kita memaksa data menjadi string
    println(value)
}

fun main() {
    printObjectIs("Khairil")
    printObjectIs(Laptop("Hp"))

    printObjectWhen(Laptop("Asus"))
    printObjectWhen("Anwar")

    printString("ini string")

}