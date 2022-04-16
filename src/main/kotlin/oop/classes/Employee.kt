package oop.classes

/***
 * Inheritance di kotlin setiap class child hanya boleh punya satu class parent, namun parent class bisa
 * punya banyak child
 * Secara standart class di kotlin itu final (tidak dapat diwarikan), agar bisa diwariskan harus menggunakan
 * kata kunci open
 * semua yg dimiliki parent class dapat diwarisi oleh child
 * -----------------------------------------------------
 * function overriding
 * secara default function pada kotlin juga bersifat final, artinya tidak dapat dioverride
 * untuk itu harus digunakan kata kunci open
 * hasil override dari function sebelumnya akan bersifat open
 * untuk membatasi agar tidak dapat dioverride maka kita harus menambah kata kunci final
 *
 * di kotlin tidak hanya function yg dapat dioverride tapi juga properties
 */

open class Employee(val name: String) {
    open fun sayHello(name: String){ //kata kunci open memungkinkan kita untuk mengoverride fungsi
        println("Hallo ${this.name}, my name $name");
    }
}

class Manager(name: String) : Employee(name){
    override fun sayHello(name: String) {// dapat dioverride di child classnya
        println("Hallo ${this.name}, my name manager $name");
    }
} // secara default class ini bersifat final
class VicePresident(name: String): Employee(name){
    final override fun sayHello(name: String) { // tidak dapat dioverride di child classnya
        println("Hallo ${this.name}, my name Vice President $name");
    }
}