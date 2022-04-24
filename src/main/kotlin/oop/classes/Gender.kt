package oop.classes

/***
 * Enum class merupakan representasi dari class yg sudah tetap nilainya
 * Enum class seperti class seperti biasa kita dapat menambahkan properties & function
 * Jika properties nya di set menggunakan constructor, maka saat pembuatan object enum, wajib diisi
 * dan jika terdapat abstract function, wajib di override pada saat pembuatan object enum
 */

enum class Gender(val description: String) {
    MALE("Male"),
    FEMALE("Female")
}