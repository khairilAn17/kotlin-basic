package oop.classes

/***
 * Kita dapat meng-override function equals untuk mengubah perbandingan object
 *
 * hashCode merupakan kode unik berupa angka yg berfungsi untuk merefresentasikan object
 * kita juga dapat meng-override hashCode untuk menyesuaikan dengan kebutuhan
 */

class Company(val name: String) {

    override fun hashCode(): Int {
        return name.hashCode()
    }

    override fun equals(other: Any?): Boolean {
        return when(other){
            is Company -> other.name == this.name
            else -> false
        }
    }
}