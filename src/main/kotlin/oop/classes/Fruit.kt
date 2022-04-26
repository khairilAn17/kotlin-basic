package oop.classes

/***
 * Kotlin mendukung pembuatan operator overloading, artinya kita bisa membuat function
 * dari operator-operator seperti operator matematika dan lain lain
 * kemampuan ini membuat kita dapat melakukan operasi apa saja di oject layaknya tipe data
 * Integer
 * Ada banyak tipe data yg dapat dioverride di kotlin
 * untuk dapat melakukan operasi maka kita harus menambahkankan kata kunci operator
 */

data class Fruit(val  quantity: Int) {
    operator fun plus(fruit: Fruit): Fruit{
        return Fruit(this.quantity + fruit.quantity)
    }
}