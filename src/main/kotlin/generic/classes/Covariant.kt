package generic.classes

/**
 * Covarian memungkinkan kita untuk melakukan sustitusi dari child ke parent
 * Cavarian dapat dilakukan dengan menambahkan kata kunci out
 * Covarian hanya dapat me return data dan tidak dapat menerima input data
 */

class Covariant<out T>(val data: T) {
    fun data(): T {
        return data
    }
}

fun main() {
    val covariantString = Covariant("Khairil")
    val covariantAny: Covariant<Any> = covariantString

    println(covariantAny.data())
}