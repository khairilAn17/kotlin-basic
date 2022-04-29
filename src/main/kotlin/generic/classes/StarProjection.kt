package generic.classes

/***
 * Star projection (*) memungkinkan kita untuk memasukkan data tanpa peduli jenis tipe datanya
 */
fun displayLength(array: Array<*>){
    println("Length Array is ${array.size}")
}

fun main() {
    val arrayInt = arrayOf(1, 2, 3, 4, 5) // tipe data integer
    val arrayString= arrayOf("Khairil", "Anwar", "keren")

    displayLength(arrayInt);
    displayLength(arrayString)
}