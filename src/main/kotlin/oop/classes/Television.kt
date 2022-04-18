package oop.classes

/***
 * di kotlin kita wajib untuk menginisialisasi data dari variable
 * namun kita bisa menunda inisialisasi dengan kata kunci lateinit
 * lateinit ini hanya berlaku untuk var (mutable)
 * untuk memanggil prorties lateinit di object kita harus memanggil method yg menginisialisasi
 * nilai properties tersebut terlabih dahulu agar tidak erro
 */

class Television {
    lateinit var brand: String // tidak harus diinisialisai

    fun iniTelevision(brand: String){
        this.brand = brand
    }
}