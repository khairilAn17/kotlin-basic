package generic.classes

/***
 * Type projection memungkinkan kita untuk memaksa generic invariant menjadi covarian atau contravariant
 */
class Container<T>(var data: T)

fun copyContainer(from: Container<out Any>, to: Container<in Any>){
    to.data = from.data
}

fun main() {
    val container1 = Container("Khairil")
    val container2: Container<Any> = Container("Anwar")

    copyContainer(container1, container2)
}