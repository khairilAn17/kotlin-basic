package generic.classes

/***
 * Generic parameter juga dapat dibuat di function
 */
class Function(val name: String) {

    fun <T> sayHello(param: T){
        println("Hallo $param, my name is $name")
    }
}