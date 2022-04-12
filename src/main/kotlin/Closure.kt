/***
 * Closure adalah kemampuan function, lamda, anonymous function
 * untuk berinteraksi dengan data-data disekitarnya dengan scope yang sama
 */

fun main() {
    var counter = 0;
    val lamdaIncrement: () -> Unit = { //unit berarti tidak mengembalikan nilai sama seperti void di java
        println("lamda increment")
        counter++;
    }

    val anonymousIncrement =  fun(){
        println("anonymous increment")
        counter++
    }

    fun incrementFun(){
        println("function increment")
        counter++
    }

    lamdaIncrement()
    anonymousIncrement()
    incrementFun()
    println(counter)
}