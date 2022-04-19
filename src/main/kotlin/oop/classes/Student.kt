package oop.classes

/***
 * Extention function merupakan function di luar class
 * sehingga dia tidak bisa mengubah isi class yg artinya dia juga tidak dapat mengakses
 * properties maupun function dll yg bersifat private atau protected
 *
 * Extention properties
 * untuk membuat extention properties kita bisa membuatnya dengan getter dan setter
 *
 * Jika extention function atau properties dapat bernilai null maka tambahkan tanda tanya setelah class
 * atau saat akan dipanggil
 */

class Student(val name: String, val age: Int)

fun Student?.sayHallo(name: String){ // extention function dapat bernilai null
   if(this != null){
       println("Hello $name, my name is ${this.name}, and my age is ${this.age}") // age tidak dapat diakses jika private
   }
}

val Student.upperName: String
    get() = this.name.uppercase();

fun main() {
    val budi: Student = Student("Budi", 12)
    println(budi.upperName)
}

