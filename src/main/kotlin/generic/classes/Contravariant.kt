package generic.classes

/***
 * Contravarian adalah kebalikan dari covariant artinya kita dapa mensubtitusi dari parent
 * ke childnya
 * Contravarian menggunakan kata kunci in dan hanya dapat menerima input tapi tidak boleh mengembalikan nilai
 */
class Contravariant<in T> {
    fun sayHello(param: T){
        println("Hello $param")
    }
}

fun main() {
    val contravariantAny = Contravariant<Any>();
    val contravariantString: Contravariant<String> = contravariantAny;

    contravariantString.sayHello("Khairil");
}