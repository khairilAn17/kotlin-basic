package generic.classes

/***
 * Generic type bersifat invariant artinya kita tidak dapat disubtitusi dengan subtype(child)
 * atau supertype(parent)
 * artinya saat kita membuat object Contoh<String>, maka tidak sama dengan Contoh<Any> meskipun Any merupakan parent
 * class dari String begitu juga sebaliknya
 *
 */
class Invariant<T>(val data: T);

fun main() {
    val invariantString = Invariant("String")
    //val invariantAny: Invariant<Any> = invariantString // error
}