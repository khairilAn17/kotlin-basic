package oop.classes

abstract class Animal {
    abstract val name: String // tidak dapat diinisialisasi
    abstract fun run(): Unit
}

class Cat: Animal(){
    override val name: String = "Meoww"
    override fun run() {
        println("my cat is $name")
    }
}