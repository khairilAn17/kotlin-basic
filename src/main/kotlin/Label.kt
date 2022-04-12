/***
 * Salah satu kegunaan label adalah bisa diintegrasikan dengan break, continue dan return
 * yaitu dapat digunakan untuk menjadi tujuan dari operasi tersebut
 */

fun main() {
   loopI@ for (i in 1..10){
       loopJ@ for (j in 1..10){
           if(i > 5){
               break@loopI
           }
            println("$i * $j = ${i * j}");

        }
    }
}