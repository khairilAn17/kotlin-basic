package oop.classes

/***
 * Data class merupakan class yg secara otomatis akan membuatkan function equals, hashCode, toString dan
 * copy dari semua properties yang terdapat di primary contructor yang dimiliki oleh data class
 * Data class dapat dibuat dengan menambahkan kata kunci data di depan sebuah class
 *
 * Copy data class dapat digunakan untuk meng-copy class sekaligus dapat mengubah propertiesnya
 */

data class Product(val name: String, val price: Int, val category: String)
class Product1(val name: String, val price: Int, val category: String)