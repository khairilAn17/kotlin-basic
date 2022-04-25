package oop.classes;

/**
 * Kotlin mendukung destructuring artinya kita dapat mengambil multi data dari satu object asal memiliki
 * componentX()
 * di data class componentX() akan otomatis dibuat
 * jika bukan data class maka kita harus membuat componentX nya secara manual
 */
data class Game(val name: String, val price: Int);

class Game1(val name: String, val price: Int){
    operator fun component1(): String = name;
    operator fun component2(): Int = price;
}