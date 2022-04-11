/***
 * Recursive yg terlalu dalam dapat menyebabkan error stack overflow
 * di Java hal ini tidak dapat dihanlde
 * sedangkan dikotlin bisa dengan menggunakan Tail Recursive
 * yaitu pada saat proses compilasi function recursive akan diubah menjadi looping biasa
 * syntaks dari Tail Recursive adalah tailrec, cth: tailrec fun factorial()
 */

fun main() {
    println(factorialWithLoop(5))
    println(factorialWithRecursive(5))

    tailrec fun display(value: Int){
        println("Recursive $value")
        if(value > 0){
            display(value - 1) //tailrec hanya boleh mengembalikan function tanpa embel2 lain, cth: display() * 2
        }
    }

    display(2)
    println(factorialWithTailRecursive(20))
}

fun factorialWithLoop(value: Int): Int{
    var result: Int = 1;
    for (i in value downTo 1){
        result *= i;
    }

    return result
}

fun factorialWithRecursive(value: Int): Int{
  return when (value){
      1 -> 1
      else -> value *  factorialWithRecursive(value - 1)
  }
}

tailrec fun factorialWithTailRecursive(value: Int, total: Long = 1): Long{
    return when(value){
        1 -> total
        else -> factorialWithTailRecursive(value - 1, total * value)
    }
}