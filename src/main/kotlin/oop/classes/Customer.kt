package oop.classes

open class Customer(val name: String, val type: String, val balance: Long) {
    constructor(name: String, type: String) : this(name, type, 0)
    constructor(name: String) : this(name, "Standart")
}

class premiumCustomer : Customer{
    constructor(name: String)
}