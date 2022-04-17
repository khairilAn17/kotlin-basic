package oop.classes

/**
 * Kita dapat meng-override method toString() karena setiap class merupakan turunan dari class any
 * yg memiliki method toString()
 */

class User(var username: String, password: String) {

    override fun toString(): String {
        return "User whith username= $username"
    }
}