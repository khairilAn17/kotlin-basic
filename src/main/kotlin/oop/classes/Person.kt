package oop.classes

/***
 * Class merupakan cetakan untuk membuat object
 * class berisi deklarasi semua properties yang akan dipakai oleh object
 * Class bisa berisi constructor yg merupakan sebuah fungsi akan pertama kali dipanggil ketika object dijalankan
 * constructor kotlin berbeda dengan di java. Di kotlin kita tidak perlu membuat fungsi cukup menambahkan
 * parameter untuk membuat primary constructor
 * Untuk menambahkan block code pada primary constructor dapat menggunakan syntax init yg disebut sebagai inializer block
 * Kotlin mendukung pembuatan banyak constructor seperti Java (Secondary constractor)
 */

class Person(nameParam: String) { // (nameParam:String ) merupakan sebuah constructor
    init { // inializer block
        print("Hello $nameParam")
    }
    var name = nameParam;
}