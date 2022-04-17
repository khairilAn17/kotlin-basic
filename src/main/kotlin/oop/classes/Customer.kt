package oop.classes

/***
 * kata kunci super juga bisa mememanggil constructor dari parent class
 */

open class Customer(val name: String, val type: String, val balance: Long) {
    constructor(name: String, type: String) : this(name, type, 0)
    constructor(name: String) : this(name, "Standart")
}
// jika kita membuat primary constructor di sini maka secondary constructor wajib memanggil primary const
class PremiumCustomer : Customer{
    constructor(name: String): super(name) // kata kunci super di sini mengakses constructor parent
    constructor(name: String, type: String): super(name, "Standar")
}