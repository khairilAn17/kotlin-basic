package generic.objects

/***
 * Generic parameter dapat lebih dari satu
 */

import generic.classes.MyData

fun main() {
    val myDataString: MyData<String> = MyData<String>("Khairil");
    myDataString.printlnData();

    val myDataInt: MyData<Int> = MyData<Int>(10);
    myDataInt.printlnData();
}