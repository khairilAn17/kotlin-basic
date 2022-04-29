package generic.classes

/***
 * Kita juga dapat membatasi type data generic dengan generic constraint
 * Dengan ini generic type yg dapat dimasukkan merupakan type data yg telah ditentukan
 * dan turunannya, jika kita tidak menyebutkan spesifik type datanya makan
 * secara default itu akan bernilai Any
 * Saat membuat generic constrain secara default kita hanya bisa membuat satu tipe data/kondidi
 * jika kita ingin lebih dari satu tipe data maka dapat menggunakan keyword where
 */
open class Employee

interface CanSayHello{
    fun sayHello(name: String)
}
class Manager: Employee()

class VicePresident: Employee(), CanSayHello {
    override fun sayHello(name: String) {
        println("Hallo $name")
    }
}

class Company<T : Employee>(val employee: T)

class Company2<T>(val employee: T) where T: Employee, T : CanSayHello

fun main() {
    val data1 = Company(Employee())
    val data2 = Company(Manager())
    val data3 = Company(VicePresident())

    val data4 = Company2(VicePresident())
}